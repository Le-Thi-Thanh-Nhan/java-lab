-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 25, 2024 at 04:42 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qldienthoai`
--

-- --------------------------------------------------------

--
-- Table structure for table `tt_dienthoai`
--

CREATE TABLE `tt_dienthoai` (
  `madt` int(9) NOT NULL,
  `hangsx` varchar(40) NOT NULL,
  `namsx` int(4) NOT NULL,
  `soluong` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tt_dienthoai`
--

INSERT INTO `tt_dienthoai` (`madt`, `hangsx`, `namsx`, `soluong`) VALUES
(1, 'OPPO', 2016, 20),
(2, 'Samsung', 2020, 16),
(3, 'IPhone', 2021, 15),
(4, 'Huawei', 2019, 21),
(5, 'Nokia', 2022, 19);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tt_dienthoai`
--
ALTER TABLE `tt_dienthoai`
  ADD PRIMARY KEY (`madt`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tt_dienthoai`
--
ALTER TABLE `tt_dienthoai`
  MODIFY `madt` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
