-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2023 a las 01:36:13
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `funcionarios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcionario`
--

CREATE TABLE `funcionario` (
  `tipo` varchar(40) NOT NULL,
  `cedula_fun` mediumint(12) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `estado_civil` varchar(10) NOT NULL,
  `telefono` int(30) NOT NULL,
  `sexo` varchar(12) NOT NULL,
  `fecha_nacimiento` varchar(20) NOT NULL,
  `direccion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `funcionario`
--

INSERT INTO `funcionario` (`tipo`, `cedula_fun`, `nombre`, `apellido`, `estado_civil`, `telefono`, `sexo`, `fecha_nacimiento`, `direccion`) VALUES
('Cedula', 3232, 'carlos andres', 'idarraga ocampo', 'Casad@', 3232, 'Masculino', '2023/6/8', 'calle 19 # 23-465');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fun_info`
--

CREATE TABLE `fun_info` (
  `cedula_fun` mediumint(12) NOT NULL,
  `id_academia` mediumint(12) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupofamiliar`
--

CREATE TABLE `grupofamiliar` (
  `cedula_grupo` mediumint(12) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `parentesco` varchar(30) NOT NULL,
  `telefono` mediumint(12) NOT NULL,
  `cedula_fun` mediumint(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `infoacademia`
--

CREATE TABLE `infoacademia` (
  `id_academia` mediumint(12) NOT NULL,
  `titulo` varchar(80) NOT NULL,
  `nivel` varchar(30) NOT NULL,
  `universidad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`cedula_fun`);

--
-- Indices de la tabla `fun_info`
--
ALTER TABLE `fun_info`
  ADD KEY `cedula_fun` (`cedula_fun`),
  ADD KEY `id_academia` (`id_academia`);

--
-- Indices de la tabla `grupofamiliar`
--
ALTER TABLE `grupofamiliar`
  ADD PRIMARY KEY (`cedula_grupo`),
  ADD UNIQUE KEY `cedula_fun` (`cedula_fun`);

--
-- Indices de la tabla `infoacademia`
--
ALTER TABLE `infoacademia`
  ADD PRIMARY KEY (`id_academia`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `fun_info`
--
ALTER TABLE `fun_info`
  ADD CONSTRAINT `FK_Cedula_fun` FOREIGN KEY (`cedula_fun`) REFERENCES `funcionario` (`cedula_fun`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_Id_academia` FOREIGN KEY (`id_academia`) REFERENCES `infoacademia` (`id_academia`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `grupofamiliar`
--
ALTER TABLE `grupofamiliar`
  ADD CONSTRAINT `FK_Cedula_fun_2` FOREIGN KEY (`cedula_fun`) REFERENCES `funcionario` (`cedula_fun`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
