-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2025 at 03:56 PM
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
-- Database: `qlxe`
--

-- --------------------------------------------------------

--
-- Table structure for table `thongtinxe`
--

CREATE TABLE `thongtinxe` (
  `maxe` int(9) NOT NULL,
  `tenxe` varchar(40) NOT NULL,
  `tenhang` varchar(40) NOT NULL,
  `giathanh` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `thongtinxe`
--

INSERT INTO `thongtinxe` (`maxe`, `tenxe`, `tenhang`, `giathanh`) VALUES
(1, 'Toyota1000', 'Toyota', 200000000),
(2, 'RollroysX600', 'Rollroys', 900000000),
(3, 'Vinx780', 'Vinfast', 400000000),
(4, 'Lambogini23w4', 'Lambogini', 500000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `thongtinxe`
--
ALTER TABLE `thongtinxe`
  ADD PRIMARY KEY (`maxe`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `thongtinxe`
--
ALTER TABLE `thongtinxe`
  MODIFY `maxe` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
