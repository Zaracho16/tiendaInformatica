
-- =========================================
-- BASE DE DATOS: tienda_informatica
-- =========================================

-- 1. TABLA USUARIOS
CREATE TABLE usuarios (
    id_usuario INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(150) NOT NULL UNIQUE,
    contrasena VARCHAR(255) NOT NULL
);

-- 2. TABLA CLIENTES
CREATE TABLE clientes (
    id_cliente INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    documento VARCHAR(30) NOT NULL UNIQUE,
    telefono VARCHAR(30),
    correo VARCHAR(150),
    direccion VARCHAR(200)
);

-- 3. TABLA CATEGORIAS
CREATE TABLE categorias (
    id_categoria INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    descripcion VARCHAR(250)
);

-- 4. TABLA PRODUCTOS
CREATE TABLE productos (
    id_producto INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(150) NOT NULL,
    descripcion VARCHAR(250),
    precio NUMERIC(12, 2) NOT NULL CHECK (precio >= 0),
    stock INTEGER NOT NULL DEFAULT 0 CHECK (stock >= 0),
    id_categoria INTEGER NOT NULL,

    CONSTRAINT fk_producto_categoria
        FOREIGN KEY (id_categoria)
        REFERENCES categorias(id_categoria)
        ON DELETE RESTRICT
);

-- 5. TABLA METODOS DE PAGO
CREATE TABLE metodos_pago (
    id_metodo_pago INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE
);

-- 6. TABLA VENTAS
CREATE TABLE ventas (
    id_venta INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    numero_factura VARCHAR(30) NOT NULL UNIQUE,
    fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    id_cliente INTEGER NOT NULL,
    id_usuario INTEGER NOT NULL,
    id_metodo_pago INTEGER NOT NULL,

    CONSTRAINT fk_venta_cliente
        FOREIGN KEY (id_cliente)
        REFERENCES clientes(id_cliente)
        ON DELETE RESTRICT,

    CONSTRAINT fk_venta_usuario
        FOREIGN KEY (id_usuario)
        REFERENCES usuarios(id_usuario)
        ON DELETE RESTRICT,

    CONSTRAINT fk_venta_metodo_pago
        FOREIGN KEY (id_metodo_pago)
        REFERENCES metodos_pago(id_metodo_pago)
        ON DELETE RESTRICT
);

-- 7. TABLA DETALLE_VENTA
CREATE TABLE detalle_venta (
    id_detalle INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    id_venta INTEGER NOT NULL,
    id_producto INTEGER NOT NULL,
    cantidad INTEGER NOT NULL CHECK (cantidad > 0),
    precio_unitario NUMERIC(12, 2) NOT NULL
        CHECK (precio_unitario >= 0),

    CONSTRAINT fk_detalle_venta
        FOREIGN KEY (id_venta)
        REFERENCES ventas(id_venta)
        ON DELETE CASCADE,

    CONSTRAINT fk_detalle_producto
        FOREIGN KEY (id_producto)
        REFERENCES productos(id_producto)
        ON DELETE RESTRICT,

    CONSTRAINT uq_venta_producto
        UNIQUE (id_venta, id_producto)
);

-- =========================================
-- DATOS INICIALES: METODOS DE PAGO
-- =========================================

INSERT INTO metodos_pago (nombre) VALUES
('Efectivo'),
('Transferencia'),
('Tarjeta');

-- =========================================
-- INDICES PARA LAS CLAVES FORANEAS
-- =========================================

CREATE INDEX idx_productos_categoria
    ON productos(id_categoria);

CREATE INDEX idx_ventas_cliente
    ON ventas(id_cliente);

CREATE INDEX idx_ventas_usuario
    ON ventas(id_usuario);

CREATE INDEX idx_ventas_metodo_pago
    ON ventas(id_metodo_pago);

CREATE INDEX idx_detalle_venta
    ON detalle_venta(id_venta);

CREATE INDEX idx_detalle_producto
    ON detalle_venta(id_producto);
