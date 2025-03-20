-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 20, 2025 at 10:54 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tbl_user`
--

-- --------------------------------------------------------

--
-- Table structure for table `table_user`
--

CREATE TABLE `table_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_contact` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_user`
--

INSERT INTO `table_user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_contact`, `u_username`, `u_password`, `u_type`, `u_status`) VALUES
(15, 'maby', 'maby', 'mabs@gmail.com', '09392162396', 'ehey', 'qheJozM0WWhVWEY2oBFMfEvfUf+PpWrUp9X1fc2JtHg=', 'admin', ' Pending'),
(16, 'angela', 'romero', 'romero@gmail.com', '09392162396', 'x11', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'user', 'Active'),
(17, 'Sir', 'asdsad', 'test@gmail.com', '09392162396', 'c11', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'admin', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `table_user`
--
ALTER TABLE `table_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `table_user`
--
ALTER TABLE `table_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
