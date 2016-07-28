-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 25 Juillet 2016 à 23:29
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `college`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE IF NOT EXISTS `classe` (
  `nomClasse` varchar(10) NOT NULL,
  `profPrincipal` varchar(255) NOT NULL,
  `niveau` int(5) NOT NULL,
  PRIMARY KEY (`nomClasse`),
  KEY `profPrincipal` (`profPrincipal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



-- --------------------------------------------------------

--
-- Structure de la table `ecole`
--

CREATE TABLE IF NOT EXISTS `ecole` (
  `ListeClasse` varbinary(550) NOT NULL,
  `ListeProf` varbinary(550) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `eleve`
--

CREATE TABLE IF NOT EXISTS `eleve` (
  `ine` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `dateNaissance` varchar(255) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `absence` float NOT NULL,
  `matiere` varbinary(500) NOT NULL,
  `nomClasse` varchar(10) NOT NULL,
  PRIMARY KEY (`ine`),
  KEY `nomClasse` (`nomClasse`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

CREATE TABLE IF NOT EXISTS `enseignant` (
  `numen` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `dateNaissance` varchar(255) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `matiere` varchar(255) NOT NULL,
  `nomClasse` varchar(10) NOT NULL,
  PRIMARY KEY (`numen`),
  KEY `nomClasse` (`nomClasse`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=741853 ;

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

CREATE TABLE IF NOT EXISTS `matiere` (
  `nomClasse` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `note`
--

CREATE TABLE IF NOT EXISTS `note` (
  `matiere` text NOT NULL,
  `ine` int(10) NOT NULL,
  `note` float NOT NULL,
  KEY `ine` (`ine`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

--
-- Clés étrangères nomClasse : `eleve` - `classe`
--
ALTER TABLE `eleve` ADD CONSTRAINT `Classe` FOREIGN KEY (`nomClasse`) REFERENCES `college`.`classe`(`nomClasse`) ON DELETE CASCADE ON UPDATE CASCADE;
