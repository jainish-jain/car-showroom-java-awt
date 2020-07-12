-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 12, 2020 at 10:18 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ip_project_carshowroom`
--

-- --------------------------------------------------------

--
-- Table structure for table `bmw`
--

CREATE TABLE `bmw` (
  `car` varchar(10) DEFAULT NULL,
  `car_class` varchar(50) DEFAULT NULL,
  `price` varchar(15) DEFAULT NULL,
  `top_speed` varchar(10) DEFAULT NULL,
  `bodystyle` varchar(50) DEFAULT NULL,
  `layout` varchar(100) DEFAULT NULL,
  `engine` varchar(100) DEFAULT NULL,
  `transmission` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bmw`
--

INSERT INTO `bmw` (`car`, `car_class`, `price`, `top_speed`, `bodystyle`, `layout`, `engine`, `transmission`) VALUES
('1 series', 'compact car', 'Rs 31 Lakh', '212 kmph', '5-door hatchback', '1.5L v5 engine', 'front engine,rear wheel drive', '5-speed manual transmission'),
('X3', 'compact luxury crossover SUV', 'Rs 48 Lakh', '195 kmph', '5-door SUV', '3.0 L N55B30M0 turbo I6', 'front engine,rear wheel drive', '8-speed ZF 8HP automatic'),
('Z4', 'compact luxury sports car', 'Rs 76 Lakh', '251 kmph', '2-door coupe convertible', '1.5L v5 engine', 'front engine,rear wheel drive', '8 speed ZF 8HP automatic');

-- --------------------------------------------------------

--
-- Table structure for table `bookcar1`
--

CREATE TABLE `bookcar1` (
  `car` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `dealer` varchar(30) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chevrolet`
--

CREATE TABLE `chevrolet` (
  `car` varchar(10) DEFAULT NULL,
  `car_class` varchar(30) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `top_speed` varchar(10) DEFAULT NULL,
  `layout` varchar(100) DEFAULT NULL,
  `engine` varchar(100) DEFAULT NULL,
  `transmission` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chevrolet`
--

INSERT INTO `chevrolet` (`car`, `car_class`, `price`, `top_speed`, `layout`, `engine`, `transmission`) VALUES
('corvette', 'sports car', 'Rs 50 Lakh', '205.6 mph', 'Front-mid engine,Rear-wheel drive', '6.2 L LT4 supercharged V8', '8-speed automatic'),
('cruze', 'compact car', 'Rs 20 Lakh', '240 kmph', 'Transverse front-engine,Front-wheel drive', '1.4 L LE2 I4', '\r\n6-speed GM 6T35 automatic'),
('bolt', 'subcompact', 'Rs 34 Lakh', '140 kmph', 'Transverse front-engine,Front-wheel drive', '150 kW (200 hp) permanent magnet motor', 'Electronic Precision Shift');

-- --------------------------------------------------------

--
-- Table structure for table `honda`
--

CREATE TABLE `honda` (
  `car` varchar(10) DEFAULT NULL,
  `car_class` varchar(30) DEFAULT NULL,
  `price` varchar(15) DEFAULT NULL,
  `top_speed` varchar(10) DEFAULT NULL,
  `layout` varchar(100) DEFAULT NULL,
  `engine` varchar(100) DEFAULT NULL,
  `transmission` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `honda`
--

INSERT INTO `honda` (`car`, `car_class`, `price`, `top_speed`, `layout`, `engine`, `transmission`) VALUES
('Amaze', 'City car', 'Rs 5.62 lakhs', '165 kmph', 'Front-engine,front-wheel drive', '1.2 L L12B i-VTEC I4 (gasoline)', '5-speed manual/automatic'),
('Avancier', 'Mid-size crossover SUV', 'Rs 30 lakhs', '180 kmph', 'Front-engine,front-wheel drive', '2.0 K20C3 VTEC TURBO', 'ZF 9-speed automatic'),
('Brio', '5-door hatchback', 'Rs 7.06 lakhs', '180 kmph', 'Front-engine,front-wheel drive', '1.3 L L13A i-VTEC I4', '5-speed manual/automatic');

-- --------------------------------------------------------

--
-- Table structure for table `koenigsegg`
--

CREATE TABLE `koenigsegg` (
  `car` varchar(10) DEFAULT NULL,
  `class` varchar(30) DEFAULT NULL,
  `price` varchar(30) DEFAULT NULL,
  `top_speed` varchar(10) DEFAULT NULL,
  `layout` varchar(100) DEFAULT NULL,
  `engine` varchar(100) DEFAULT NULL,
  `transmission` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `koenigsegg`
--

INSERT INTO `koenigsegg` (`car`, `class`, `price`, `top_speed`, `layout`, `engine`, `transmission`) VALUES
('CCXR', 'Sports car', 'Rs 3 crore', '410 kmph', 'Rear mid-engine,rear-wheel drive', '4.8L V8 twin engine', '6-speed manual/automatic'),
('One:1', 'Sports car', 'Rs 12 crore', '451 kmph', 'Rear mid-engine,rear-wheel drive', '5L V8 twin-tubocharged engine', '7-speed dual clutch paddle shift'),
('Agera RS', 'Sports car', 'Rs 12 crore', '430 kmph', 'Rear mid-engine,rear-wheel drive', '5L V8 twin engine', '7-speed dual clutch paddle shift');

-- --------------------------------------------------------

--
-- Table structure for table `lamborghini`
--

CREATE TABLE `lamborghini` (
  `car` varchar(10) DEFAULT NULL,
  `class` varchar(50) DEFAULT NULL,
  `price` varchar(30) DEFAULT NULL,
  `top_speed` varchar(10) DEFAULT NULL,
  `bodystyle` varchar(50) DEFAULT NULL,
  `layout` varchar(100) DEFAULT NULL,
  `engine` varchar(100) DEFAULT NULL,
  `transmission` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lamborghini`
--

INSERT INTO `lamborghini` (`car`, `class`, `price`, `top_speed`, `bodystyle`, `layout`, `engine`, `transmission`) VALUES
('Gallardo', 'Sports car', 'Rs 3.06 crore', '325 kmph', '2-door roadster', 'Longitudinal, M4', 'Odd firing 5.2 L V10', '6-speed E-Gear automated manual'),
('Murcielago', 'Supercar', 'Rs 3.6 crore', '330 kmph', '2-door roadster', 'Longitudinal, Mid engine, All wheel drive', '6.5 L V12 (670 HP)', '6-speed e-Gear semi-automatic'),
('Aventador', 'Sports car', 'Rs 4.78 crore', '350 kmph', '2-door roadster', 'Longitudinal, Mid engine, All wheel drive', '6.5 L L539 V12', '7-speed ISR Semi-automatic transmission');

-- --------------------------------------------------------

--
-- Table structure for table `servicepage`
--

CREATE TABLE `servicepage` (
  `COMPANIES` varchar(30) DEFAULT NULL,
  `COUNTRY` varchar(30) DEFAULT NULL,
  `ADDRESS` varchar(100) DEFAULT NULL,
  `SERVICE_NO` int(20) DEFAULT NULL,
  `DELIVERY_NO` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `servicepage`
--

INSERT INTO `servicepage` (`COMPANIES`, `COUNTRY`, `ADDRESS`, `SERVICE_NO`, `DELIVERY_NO`) VALUES
('bmw', 'germany', 'munich bavaria', 18001099, 180010322),
('honda', 'japan', 'minato tokyo', 1242290911, 1242294514),
('chevrolet', 'U.S.A', 'detroit michigan', 180030008, 1800641312),
('koeniggsegg', 'sweden', 'angelholm', 46431345, 4643154),
('lamborghini', 'italy', 'santagata bolognese', 1905959, 3905959),
('tesla', 'U.S.A', 'palo alto california', 8885183, 8885183),
('koenigsegg', 'sweden', 'angelholm', 8472956, 8472956);

-- --------------------------------------------------------

--
-- Table structure for table `tesla`
--

CREATE TABLE `tesla` (
  `car` varchar(10) DEFAULT NULL,
  `class` varchar(30) DEFAULT NULL,
  `price` varchar(30) DEFAULT NULL,
  `top_speed` varchar(10) DEFAULT NULL,
  `layout` varchar(100) DEFAULT NULL,
  `engine` varchar(100) DEFAULT NULL,
  `transmission` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tesla`
--

INSERT INTO `tesla` (`car`, `class`, `price`, `top_speed`, `layout`, `engine`, `transmission`) VALUES
('roadster', '2-door roadster', 'Rs 49 Lakhs', '125 mph', 'Rear-mid engine,Rear-wheel drive', '2.5 Sport 288 hp (215 kW), 295 lb.ft (400 N.m)', ' 3-phase 4-pole'),
('Model S', '5-door liftback', 'Rs 35 Lakhs', '155 mph', 'Rear-motor,Rear-wheel drive', 'Front and rear motor combined output up to 762 bhp', '1-speed fixed gear'),
('Model X', 'Full size,luxury,crossover SUV', 'Rs 55 Lakhs', '155 mph', 'Rear-mid engine,Rear-wheel drive', 'Dual Motor AWD 90D', 'Single-speed transaxle gearbox');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `FirstName`, `LastName`) VALUES
('admin', 'admin', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
