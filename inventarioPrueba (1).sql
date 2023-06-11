-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 11-06-2023 a las 00:51:56
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventarioPrueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` varchar(8) DEFAULT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `apellido`, `nombre`, `domicilio`, `telefono`, `estado`) VALUES
(3, NULL, 'Flores', 'Mariana', 'Rivadavia 340', '2664007666', 0),
(4, NULL, 'Fernandez', 'Lucas', 'Rivadavia 800', '2664001122', 0),
(5, NULL, 'Perez', 'Luis', 'Sa Martin 400', '2664998877', 0),
(6, NULL, 'Perez', 'Luis', 'Sa Martin 400', '2664998877', 0),
(7, NULL, 'Perez', 'Luis', 'Sa Martin 400', '2664998877', 0),
(8, NULL, 'Perez', 'Luis', 'Sa Martin 400', '2664998877', 0),
(9, '33445566', 'Perez', 'Juan', 'San Martin 200', '2664112233', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `fecha`, `idProveedor`, `estado`) VALUES
(1, '2023-06-08', 1, 0),
(3, '2023-06-03', 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleCompra`
--

CREATE TABLE `detalleCompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idCompra` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalleCompra`
--

INSERT INTO `detalleCompra` (`idDetalle`, `cantidad`, `precioCosto`, `idCompra`, `idProducto`) VALUES
(1, 3, 250, 1, 1),
(8, 3, 200, 1, 2),
(9, 10, 250, 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleVenta`
--

CREATE TABLE `detalleVenta` (
  `idDetalleVenta` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioVenta` double NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalleVenta`
--

INSERT INTO `detalleVenta` (`idDetalleVenta`, `cantidad`, `precioVenta`, `idVenta`, `idProducto`) VALUES
(1, 3, 350, 1, 1),
(2, 3, 500, 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `descripcion` varchar(60) NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `descripcion`, `precioActual`, `stock`, `estado`) VALUES
(1, 'Cuaderno', 300, 0, 1),
(2, 'Lapicera', 200, 20, 1),
(3, 'Reglas', 200, 30, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `razonSocial` varchar(50) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `razonSocial`, `domicilio`, `telefono`, `estado`) VALUES
(1, 'Ledesma', 'Belgrano 510', '3518763456', 0),
(2, 'Rivadavia', '25 de Mayo 300', '2664998877', 1),
(3, 'Bic', '25 de Mayo 350', '2664345675', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idCliente` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `fecha`, `idCliente`, `estado`) VALUES
(1, '2023-06-01', 4, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`);

--
-- Indices de la tabla `detalleCompra`
--
ALTER TABLE `detalleCompra`
  ADD PRIMARY KEY (`idDetalle`);

--
-- Indices de la tabla `detalleVenta`
--
ALTER TABLE `detalleVenta`
  ADD PRIMARY KEY (`idDetalleVenta`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD UNIQUE KEY `descripcion` (`descripcion`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`),
  ADD UNIQUE KEY `razonSocial` (`razonSocial`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `detalleCompra`
--
ALTER TABLE `detalleCompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `detalleVenta`
--
ALTER TABLE `detalleVenta`
  MODIFY `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `detalleCompra`
--
ALTER TABLE `detalleCompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`);

--
-- Filtros para la tabla `detalleVenta`
--
ALTER TABLE `detalleVenta`
  ADD CONSTRAINT `detalleventa_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `detalleventa_ibfk_2` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
