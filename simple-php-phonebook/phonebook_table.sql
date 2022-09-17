-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3308
-- Generation Time: Aug 21, 2020 at 08:46 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `phonebook`
--

-- --------------------------------------------------------

--
-- Table structure for table `phonebook_table`
--

CREATE TABLE `phonebook_table` (
  `id` int(11) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `phonetype` varchar(30) DEFAULT NULL,
  `pnumber` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phonebook_table`
--

INSERT INTO `phonebook_table` (`id`, `fname`, `lname`, `phonetype`, `pnumber`) VALUES
(113, 'Wei Hong', 'Chang', 'Cellular', '01116203836'),
(114, 'Wei Hong', 'Chang', 'Cellular', '01116203836'),
(115, 'John', 'John', 'Home', '123123123'),
(116, 'Test', 'Test', 'Home', '123'),
(119, '123', '123', 'Home', '123'),
(120, '123', '123', 'Home', '123'),
(121, '321', '321', 'Cellular', '321'),
(122, 'Alan', 'Alan', 'Cellular', '123123123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `phonebook_table`
--
ALTER TABLE `phonebook_table`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `phonebook_table`
--
ALTER TABLE `phonebook_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
