-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2024 at 01:30 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `qlsanpham`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE IF NOT EXISTS `products` (
  `ID` varchar(8) COLLATE utf8_vietnamese_ci NOT NULL,
  `Name` varchar(20) COLLATE utf8_vietnamese_ci NOT NULL,
  `Number` varchar(15) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`ID`, `Name`, `Number`) VALUES
('sp01', 'Quạt bàn', '100'),
('sp02', 'Áo sơ mi', '1000'),
('sp05', 'Áo khoác', '450'),
('sp06', 'Áo dài đẹp', '150'),
('sp08', 'Áo trẻ em', '1500'),
('sp12', 'Đồ cắm trại', '1200'),
('sp15', 'Quần lửng', '2100'),
('sp13', 'Màn ngủ', '2300'),
('sp14', 'Quần Âu', '2300'),
('sp03', 'Áo bơi', '300'),
('sp09', 'Quần lửng', '2100'),
('sp10', 'Áo dài tay', '300'),
('sp11', 'Kính bơi', '300'),
('sp07', 'Quần Âu', '300'),
('sp20', 'Áo cộc tay', '470'),
('sp04', 'Áo cộc tay', '470');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` varchar(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
('1', 'admin', 'admin'),
('100', 'admin5', '123456'),
('15', 'vungoc', '123456'),
('16', 'admin16', '123456'),
('18', 'admin4', '123456'),
('2', 'user1', '123'),
('3', 'user2', '123'),
('4', 'user3', '123'),
('5', 'user4', '123'),
('7', 'PhamHong', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
