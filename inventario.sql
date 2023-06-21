-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 21-06-2023 a las 20:44:20
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
  `telefono` varchar(20) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `apellido`, `nombre`, `domicilio`, `telefono`, `estado`) VALUES
(3, '33888356', 'Dominguez', 'Fererico', 'Rivadavia 340', '2664004455', 0),
(4, NULL, 'Fernandez', 'Lucas', 'Rivadavia 800', '2664001122', 0),
(5, NULL, 'Perez', 'Luis', 'Sa Martin 400', '2664998877', 0),
(6, NULL, 'Perez', 'Luis', 'Sa Martin 400', '2664998877', 0),
(7, NULL, 'Perez', 'Luis', 'Sa Martin 400', '2664998877', 0),
(8, NULL, 'Perez', 'Luis', 'Sa Martin 400', '2664998877', 0),
(9, '33445566', 'Perez', 'Juan', 'San Martin 200', '2664112233', 0),
(12, '33888469', 'Flores', 'Mariana Soledad', 'ayacucho 425', '2664007666', 0),
(14, '', '', '', '', '', 0),
(17, 'ljbibh ', 'lknfiwo', 'w,mar nfvk', 'vkngiarfv', 'nkbspt', 1),
(18, '65543354', 'rkmtsewng', 'dbmknehtd', 'klsgmnoint', 'rrrrrrrrrr', 0),
(19, 'WWWWWWWW', ',.kwnLRK', 'RKFNVLNKN', 'JAWNBVF', ',MJCNFRIJBNG', 0),
(20, '33333333', 'Lucas', 'lkfmnroesfg', 'klszdnfrgi', '266499999', 1),
(21, '29436123', 'Garcia', 'Jose', 'Mitre 190', '2664334422', 0),
(22, '32410497', 'MEDINA', 'SOL', 'LALALA 657', '2664791345', 1),
(23, '33444444', 'Perez', 'Jose Luis', 'Belgrano 80', '266499887', 1),
(24, '33777666', 'Gomez', 'Aldo', 'belgrano', '2664234563', 0),
(25, '33777667', 'Gomez', 'Aldo', 'belgrano', '266423456m', 0),
(26, '22456456', 'Sosa', 'Nicolas', 'Ayacucho 100', '266412312', 0),
(28, '33444555', 'Molina', 'Pablo', 'La Punta', '2664567890', 1),
(29, '23456456', 'Molina', 'Ezequiel', 'Belgrano 100', '2664556677', 1),
(30, '567567', 'Folsk', 'szckn', 'csjefnd', '23232323', 0),
(31, '234234', 'waerdg', 'wedxgfv', 'wertyu', '4232232232', 0),
(33, '23234234', 'Perez', 'Jose', 'Rivadavia 50', '222222222', 1),
(35, '44555666', 'Jose', 'Perez', 'San Martin', '23454323', 0),
(36, '12456456', 'Sanchez', 'Martin', 'Madarin', '45345', 1),
(37, '5456456', 'BOSELLI', 'ELISA', 'COLON', '255433333', 1),
(38, '1234567', 'BOSELLI', 'ELISA', 'COLON', '3584221940', 1),
(42, '22345345', 'Flores', 'Mariana', 'ljandivreas', '2222222222', 1),
(44, '98567567', '.sckneirg', '.fnrinvfrfd', ',zsjneirfjnv', '3333333333', 1),
(45, '9856756', '.sckneirg', '.fnrinvfrfd', ',zsjneirfjnv', '3333333333', 1),
(46, '6576576', 'nnnnnnnn', 'nnnnnnnn', 'nmnnnnnnn', '2664007666', 1),
(47, '45689789', 'mmmmmm', 'mmmmmmm', 'mmmmmmm', '6655445675', 1),
(48, '67867856', 'mmmmmm', 'm', 'm', '5', 1),
(49, '45345789', 'nnnnnn', 'n', 'n', '2664007666', 1),
(50, '56258378', '3', '3', 'er', '2343232323', 0),
(51, '30089765', 'Sosa', 'Maria', 'La Palta 96', '2664987654', 1),
(52, '32410499', 'MADREA', 'CLAUDIA', 'PRINGLES 1470', '2664791334', 1);

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
(1, '2023-06-08', 1, 1),
(3, '2023-06-03', 2, 1),
(4, '2023-06-08', 3, 1),
(5, '2023-06-06', 3, 1),
(6, '2023-06-12', 1, 1),
(7, '2023-06-12', 1, 1),
(8, '2023-06-17', 1, 1),
(9, '2023-06-05', 2, 1),
(10, '2023-06-07', 3, 1),
(11, '2023-06-20', 1, 1),
(12, '2023-06-06', 4, 1),
(13, '2023-06-06', 1, 1),
(14, '2023-06-15', 3, 1),
(15, '2023-06-14', 1, 1),
(16, '2023-06-07', 1, 1),
(17, '2023-06-30', 1, 1),
(18, '2023-06-07', 1, 1),
(19, '2023-06-13', 1, 1),
(20, '2023-06-10', 1, 1),
(21, '2023-06-15', 4, 1),
(22, '2023-06-06', 4, 1),
(23, '2023-06-07', 4, 1),
(24, '2023-06-18', 1, 1),
(25, '2023-06-10', 3, 1),
(26, '2023-06-13', 1, 1),
(27, '2023-06-07', 1, 1),
(28, '2023-06-06', 1, 1),
(29, '2023-06-02', 1, 1),
(30, '2023-06-08', 1, 1),
(31, '2023-06-08', 1, 1),
(32, '2023-05-09', 1, 1),
(33, '2023-06-01', 1, 1),
(34, '2023-06-20', 5, 1),
(35, '2023-06-20', 5, 1),
(36, '2023-06-18', 5, 1),
(37, '2023-06-15', 5, 1),
(38, '2023-06-10', 5, 1),
(39, '2023-06-09', 1, 1),
(40, '2023-06-05', 1, 1),
(41, '2023-06-02', 1, 1),
(42, '2023-06-08', 1, 1),
(43, '2023-06-03', 1, 1),
(44, '2023-06-02', 1, 1),
(45, '2023-06-02', 1, 1),
(46, '2023-06-02', 1, 1),
(47, '2023-06-02', 1, 1),
(48, '2023-06-02', 1, 1),
(49, '2023-06-05', 1, 1),
(50, '2023-06-01', 1, 1),
(51, '2023-06-01', 1, 1),
(52, '2023-06-01', 1, 1),
(53, '2023-06-07', 1, 1);

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
(9, 10, 250, 1, 3),
(10, 3, 150000, 1, 1),
(11, 3, 150000, 6, 2),
(12, 5, 200, 8, 3),
(13, 3, 150000, 3, 2),
(14, 4, 0, 11, 2),
(15, 3, 300, 12, 1),
(16, 1, 300000, 13, 6),
(17, 3, 200, 14, 3),
(18, 3, 300, 19, 1),
(19, 3, 150000, 20, 5),
(20, 2, 300, 21, 1),
(21, 3, 30000, 3, 3),
(22, 4, 3000, 6, 5),
(23, 5, 4000, 4, 1),
(24, 2, 4000, 1, 3),
(25, 50, 2345, 10, 2),
(26, 6, 500, 5, 1),
(27, 20, 300, 26, 1),
(28, 1, 2345, 27, 2),
(29, 5, 150000, 28, 5),
(30, -1, 500, 28, 2),
(31, 1, 300, 27, 2),
(32, 5, 70000, 29, 5),
(33, 6, 300000, 30, 6),
(34, 3, 300000, 31, 1),
(35, 5, 300000, 32, 6),
(36, 3, 300000, 33, 1),
(37, 2, 120000, 35, 7),
(38, 1, 50000, 36, 5),
(39, 2, 250000, 37, 7),
(40, 2, 500000, 38, 7),
(41, 1, 0, 40, 3),
(42, 1, 50000, 41, 1),
(43, 1, 300000, 53, 1);

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
(2, 3, 500, 1, 3),
(3, 4, 200000, 1, 2),
(4, 39, 300, 0, 1),
(5, 30, 300, 2, 1),
(6, 5, 0, 4, 1),
(7, 5, 0, 4, 1),
(8, 5, 300, 4, 1),
(9, 5, 300, 4, 1),
(10, 5, 300, 4, 1),
(11, 5, 300, 4, 1),
(12, 5, 300, 4, 1),
(13, 5, 300, 4, 1),
(14, 5, 300, 4, 1),
(15, 20, 200, 5, 2),
(16, 3, 0, 7, 5),
(17, 3, 0, 11, 2),
(18, 7, 600, 12, 3),
(19, 7, 600, 12, 3),
(20, 6, 400, 13, 1),
(21, 10, 400, 19, 3),
(22, 70, 700, 0, 1),
(23, 30, 400, 3, 1),
(24, 73, 1000, 3, 5),
(25, 3, 3000, 20, 1),
(26, 7, 600, 14, 1),
(27, 3, 600, 3, 2);

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
(1, 'Lavarropas', 300000, 18, 0),
(2, 'Microondas', 20000, 61, 1),
(3, 'Cocina', 100000, 21, 0),
(5, 'Monitor', 70000, 11, 0),
(6, 'Heladera', 300000, 15, 1),
(7, 'MESA', 150000, 11, 1);

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
(2, 'rivadavia', '25 de Mayo 30', '2664998877', 0),
(3, 'Bic', '25 de Mayo 350', '2664345675', 1),
(4, 'TiendaShop', 'Maipu 1019', '2665389234', 1),
(5, 'SAN CARLOS', 'Necochea', '26645959594', 0);

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
(1, '2023-06-01', 4, 1),
(2, '2023-06-11', 3, 1),
(3, '2023-06-07', 12, 1),
(4, '2023-06-13', 12, 1),
(5, '2023-06-14', 3, 1),
(6, '2023-06-13', 35, 1),
(7, '2023-06-07', 12, 1),
(8, '2023-03-07', 3, 1),
(9, '2023-06-08', 3, 1),
(10, '2023-06-15', 3, 1),
(11, '2023-06-26', 3, 1),
(12, '2023-06-23', 3, 1),
(13, '2023-06-01', 33, 1),
(14, '2023-06-01', 3, 1),
(15, '2023-06-08', 3, 1),
(16, '2023-06-04', 3, 1),
(17, '2023-04-03', 3, 1),
(18, '2023-05-11', 3, 1),
(19, '2023-05-08', 3, 1),
(20, '2023-06-07', 3, 1),
(21, '2023-06-20', 3, 1),
(22, '2023-05-09', 3, 1),
(23, '2023-06-05', 3, 1);

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
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT de la tabla `detalleCompra`
--
ALTER TABLE `detalleCompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT de la tabla `detalleVenta`
--
ALTER TABLE `detalleVenta`
  MODIFY `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

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
