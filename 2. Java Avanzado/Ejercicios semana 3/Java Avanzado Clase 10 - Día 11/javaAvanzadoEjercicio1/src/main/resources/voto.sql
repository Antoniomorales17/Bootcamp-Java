-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-03-2024 a las 12:02:59
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
-- Base de datos: `votaciones`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `voto`
--

CREATE TABLE `voto` (
  `ID` bigint(20) NOT NULL,
  `OPCION` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `voto`
--

INSERT INTO `voto` (`ID`, `OPCION`) VALUES
(1, 'opcion1'),
(51, 'opcion2'),
(101, 'opcion2'),
(151, 'opcion1'),
(201, 'opcion3'),
(202, 'opcion1'),
(251, 'opcion3'),
(252, 'opcion2'),
(253, 'opcion1'),
(254, 'opcion1'),
(301, 'opcion2'),
(302, 'opcion1'),
(351, 'opcion3'),
(352, 'opcion2'),
(353, 'opcion1'),
(354, 'opcion3'),
(401, 'opcion3'),
(402, 'opcion1'),
(451, NULL),
(452, 'opcion3'),
(501, 'opcion3'),
(551, 'opcion2'),
(552, 'opcion1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `voto`
--
ALTER TABLE `voto`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
