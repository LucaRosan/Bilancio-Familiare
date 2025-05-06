-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 06, 2025 alle 10:24
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bilancio_familiare`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `operazioni_finanziarie`
--

CREATE TABLE `operazioni_finanziarie` (
  `id` int(11) NOT NULL,
  `data_operazione` date NOT NULL,
  `descrizione` varchar(255) NOT NULL,
  `importo` decimal(10,2) NOT NULL,
  `tipo_movimento` varchar(10) NOT NULL,
  `bilancio_finale` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `operazioni_finanziarie`
--

INSERT INTO `operazioni_finanziarie` (`id`, `data_operazione`, `descrizione`, `importo`, `tipo_movimento`, `bilancio_finale`) VALUES
(14, '2000-03-23', 'sdadasd', 2300.00, 'ENTRATA', 2300.00);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `operazioni_finanziarie`
--
ALTER TABLE `operazioni_finanziarie`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `operazioni_finanziarie`
--
ALTER TABLE `operazioni_finanziarie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
