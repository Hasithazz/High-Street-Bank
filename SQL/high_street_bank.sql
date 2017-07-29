--
-- Database: `high_street_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `userID` int(11) NOT NULL,
  `userName` varchar(200) NOT NULL,
  `userPassword` varchar(200) NOT NULL,
  `position` varchar(200) NOT NULL,
  `Name` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`userID`, `userName`, `userPassword`, `position`, `Name`) VALUES
(1, 'Hasitha', 'admin', 'Manager', 'Hasitha Edirisinghe');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerName` varchar(200) NOT NULL,
  `birthDate` date NOT NULL,
  `address` varchar(200) NOT NULL,
  `mobile` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `accountType` varchar(200) NOT NULL,
  `accountNumber` varchar(200) NOT NULL,
  `sortCode` tinyint(4) NOT NULL,
  `balance` double NOT NULL DEFAULT '0',
  `card` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerName`, `birthDate`, `address`, `mobile`, `email`, `accountType`, `accountNumber`, `sortCode`, `balance`, `card`) VALUES
('Zub Zero', '1996-07-24', 'Lin Kuei,Out World', '770421233', 'ZZ@gmail.com', 'Savings', '012345678910', 1, 15000, '5465 7898 2321 4895'),
('Ajitha Edirisinghe', '1966-04-22', '125/6,Pollwatta rd,Kaluwadumulla,Ambalangoda', '0777738685', 'akedirisinghe@live.com', 'Savings', '987856453221', 111, 10000, '0123 4567 8910 1112');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `userID` int(11) NOT NULL,
  `userName` varchar(200) NOT NULL,
  `userPassword` varchar(200) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Position` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`userID`, `userName`, `userPassword`, `Name`, `Position`) VALUES
(1, 'Gathitha', 'employee', 'Gathitha Edirisinghe', 'Accountant '),
(2, 'Scorpian', 'employee2', 'Scorpian', 'Accountant'),
(3, 'Kasun', 'employee3', 'Kasun Kalhara', 'Accountant'),
(4, 'EdShreen', 'employee4', 'Ed Shirantha', 'Clarck');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`userID`),
  ADD UNIQUE KEY `userName` (`userName`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`accountNumber`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`userID`),
  ADD UNIQUE KEY `userName` (`userName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
