-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-02-2024 a las 18:34:51
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `restaurante`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `platillo`
--

CREATE TABLE `platillo` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL,
  `RECETA` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `platillo`
--

INSERT INTO `platillo` (`ID`, `NOMBRE`, `PRECIO`, `RECETA`) VALUES
(1, 'Paella', 20, 'Arroz'),
(3, 'Pizza', 50, 'Queso'),
(4, 'Paella', 20, 'Arroz'),
(5, 'Patatas bravas', 10, 'Tomate'),
(6, 'Pizza', 10, 'Queso'),
(7, 'Paella', 20, 'Arroz'),
(8, 'Patatas bravas', 10, 'Tomate'),
(9, 'Pizza', 10, 'Queso');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `platillo`
--
ALTER TABLE `platillo`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `platillo`
--
ALTER TABLE `platillo`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
