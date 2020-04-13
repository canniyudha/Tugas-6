-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 13, 2020 at 04:20 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tugas6`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `ID` int(5) NOT NULL,
  `Judul` varchar(20) NOT NULL,
  `Tipe` varchar(20) NOT NULL,
  `Episode` varchar(20) NOT NULL,
  `Genre` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `Rating` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`ID`, `Judul`, `Tipe`, `Episode`, `Genre`, `Status`, `Rating`) VALUES
(2, 'Game of Thrones', 'Series', '73', 'Action, Fantasy', ' Selesai', '4'),
(3, 'The Witcher', 'Series', '10', 'Action, Fantasy', ' Belum', '5'),
(6, 'The Hobbit', 'Film', '-', 'Action, Fantasy', ' Belum', '5'),
(8, 'Big Bang Theory', 'Series', '273', 'Comedy, Drama', ' Selesai', '4'),
(9, 'John Wick', 'Film', '-', 'Action', ' Selesai', '5'),
(10, 'Cats', 'Film', '-', 'HORROR', ' Selesai', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data`
--
ALTER TABLE `data`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
