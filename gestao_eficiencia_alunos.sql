SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE DATABASE IF NOT EXISTS `gestao_eficiencia_alunos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `gestao_eficiencia_alunos`;

DROP TABLE IF EXISTS `algoritmo`;
CREATE TABLE `algoritmo` (
  `COD_ALGORITMO` smallint(5) NOT NULL,
  `COD_PROBLEMA` int(11) NOT NULL,
  `COD_AREA_PESQUISA` smallint(5) NOT NULL,
  `COD_LINGUAGEM` tinyint(3) NOT NULL,
  `COD_COMPLEXIDADE` tinyint(3) NOT NULL,
  `COD_RA_ALUNO` int(11) NOT NULL,
  `DES_ALGORITMO` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `algoritmo` (`COD_ALGORITMO`, `COD_PROBLEMA`, `COD_AREA_PESQUISA`, `COD_LINGUAGEM`, `COD_COMPLEXIDADE`, `COD_RA_ALUNO`, `DES_ALGORITMO`) VALUES
(1, 1, 2, 1, 2, 4204117, 'ALGORITMO BOLHA'),
(2, 1, 2, 1, 2, 12105855, 'ALGORITMO BOLHA'),
(3, 1, 2, 1, 2, 111114321, 'ALGORITMO BOLHA');

DROP TABLE IF EXISTS `aluno`;
CREATE TABLE `aluno` (
  `COD_RA_ALUNO` int(11) NOT NULL,
  `COD_CURSO` int(11) NOT NULL,
  `NOM_ALUNO` varchar(200) DEFAULT NULL,
  `DES_EMAIL` varchar(50) DEFAULT NULL,
  `DTA_MATRICULA` datetime DEFAULT NULL,
  `NUM_MEDIA_GLOBAL` tinyint(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `aluno` (`COD_RA_ALUNO`, `COD_CURSO`, `NOM_ALUNO`, `DES_EMAIL`, `DTA_MATRICULA`, `NUM_MEDIA_GLOBAL`) VALUES
(4204117, 1, 'Claudimar Saraiva de Castro', 'claudimar@gmail.com', '2018-01-01 00:00:00', 75),
(12105855, 1, 'Rodolpho Henrique Maia Braga', 'rodolpho@gmail.com', '2018-01-01 00:00:00', 80),
(111114321, 1, 'Tamara Geralda Batista Sales', 'tamara@gmail.com', '2018-01-01 00:00:00', 85);

DROP TABLE IF EXISTS `area_pesquisa`;
CREATE TABLE `area_pesquisa` (
  `COD_AREA_PESQUISA` smallint(5) NOT NULL,
  `NOM_AREA_PESQUISA` varchar(30) DEFAULT NULL,
  `DES_AREA_PESQUISA` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `area_pesquisa` (`COD_AREA_PESQUISA`, `NOM_AREA_PESQUISA`, `DES_AREA_PESQUISA`) VALUES
(1, 'AREA 1', 'DESCRICAO AREA 1'),
(2, 'AREA 2', 'DESCRICAO AREA 2'),
(3, 'AREA 3', 'DESCRICAO AREA 3');

DROP TABLE IF EXISTS `complexidade`;
CREATE TABLE `complexidade` (
  `COD_COMPLEXIDADE` tinyint(3) NOT NULL,
  `DES_GRAU_COMPLEXIDADE` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `complexidade` (`COD_COMPLEXIDADE`, `DES_GRAU_COMPLEXIDADE`) VALUES
(1, 'FACIL'),
(2, 'MODERADO'),
(3, 'DIFICIL');

DROP TABLE IF EXISTS `curso`;
CREATE TABLE `curso` (
  `COD_CURSO` int(11) NOT NULL,
  `NOM_CURSO` varchar(200) DEFAULT NULL,
  `NUM_PERIODO` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `curso` (`COD_CURSO`, `NOM_CURSO`, `NUM_PERIODO`) VALUES
(1, 'ANALISE DESENVOLVIMENTO DE SISTEMAS', '1'),
(2, 'ENGENHARIA DE SOFTWARE', '1'),
(3, 'ENGENHARIA MECANICA', '1');

DROP TABLE IF EXISTS `linguagem`;
CREATE TABLE `linguagem` (
  `COD_LINGUAGEM` tinyint(3) NOT NULL,
  `NOM_LINGUAGEM` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `linguagem` (`COD_LINGUAGEM`, `NOM_LINGUAGEM`) VALUES
(1, 'Java'),
(2, 'C#'),
(3, 'Python'),
(4, 'Ruby'),
(5, 'Swift'),
(6, 'Javascript'),
(7, 'PHP');

DROP TABLE IF EXISTS `problema`;
CREATE TABLE `problema` (
  `COD_PROBLEMA` int(11) NOT NULL,
  `DES_PROBLEMA` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `problema` (`COD_PROBLEMA`, `DES_PROBLEMA`) VALUES
(1, 'ALGORITMO BOLHA'),
(2, 'ORDENACAO ARRAY'),
(3, 'MELHOR PERFORMANCE PARA EMPILHAR');

DROP TABLE IF EXISTS `solucao`;
CREATE TABLE `solucao` (
  `COD_SOLUCAO` int(11) NOT NULL,
  `COD_ALGORITMO` smallint(5) NOT NULL,
  `DES_SOLUCAO` text DEFAULT NULL,
  `DTA_SOLUCAO` datetime DEFAULT NULL,
  `DES_COMPUTADOR` text DEFAULT NULL,
  `NOM_ARQ_SOLUCAO` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `solucao` (`COD_SOLUCAO`, `COD_ALGORITMO`, `DES_SOLUCAO`, `DTA_SOLUCAO`, `DES_COMPUTADOR`, `NOM_ARQ_SOLUCAO`) VALUES
(1, 1, 'SOLUCAO NR 1 ALGORITMO 1', '2019-10-04 00:00:00', 'COMPUTADOR 1', 'ARQUIVO SOLU. 1'),
(2, 1, 'SOLUCAO NR 2 ALGORITMO 1', '2019-10-04 00:00:00', 'COMPUTADOR 1', 'ARQUIVO SOLU. 2'),
(3, 2, 'SOLUCAO NR 1 ALGORITMO 2', '2019-10-04 00:00:00', 'COMPUTADOR 1', 'ARQUIVO SOLU. 1'),
(4, 2, 'SOLUCAO NR 2 ALGORITMO 2', '2019-10-04 00:00:00', 'COMPUTADOR 1', 'ARQUIVO SOLU. 2'),
(5, 3, 'SOLUCAO NR 1 ALGORITMO 3', '2019-10-04 00:00:00', 'COMPUTADOR 1', 'ARQUIVO SOLU. 1'),
(6, 3, 'SOLUCAO NR 2 ALGORITMO 3', '2019-10-04 00:00:00', 'COMPUTADOR 1', 'ARQUIVO SOLU. 2');

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `COD_USUARIO` int(11) NOT NULL,
  `NOM_USUARIO` varchar(200) DEFAULT NULL,
  `DES_LOGIN` varchar(200) DEFAULT NULL,
  `NUM_SENHA` varchar(50) DEFAULT NULL,
  `2FA` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `usuario` (`COD_USUARIO`, `NOM_USUARIO`, `DES_LOGIN`, `NUM_SENHA`, `2FA`) VALUES
(1, 'CLAUDIMAR', 'claudimar', '827ccb0eea8a706c4c34a16891f84e7b', 0),
(2, 'TAMARA', 'tamara', '827ccb0eea8a706c4c34a16891f84e7b', 0),
(3, 'RODOLPHO', 'rodolpho', '827ccb0eea8a706c4c34a16891f84e7b', 0),
(4, 'Rui', 'rui', '827ccb0eea8a706c4c34a16891f84e7b', 0);


ALTER TABLE `algoritmo`
  ADD PRIMARY KEY (`COD_ALGORITMO`),
  ADD KEY `fk_ALGORITMO_COD_PROBLEMA` (`COD_PROBLEMA`),
  ADD KEY `fk_ALGORITMO_COD_AREA_PESQUISA` (`COD_AREA_PESQUISA`),
  ADD KEY `fk_ALGORITMO_COD_LINGUAGEM` (`COD_LINGUAGEM`),
  ADD KEY `fk_ALGORITMO_COD_COMPLEXIDADE` (`COD_COMPLEXIDADE`),
  ADD KEY `fk_ALGORITMO_COD_RA_ALUNO` (`COD_RA_ALUNO`);

ALTER TABLE `aluno`
  ADD PRIMARY KEY (`COD_RA_ALUNO`),
  ADD KEY `fk_ALUNO_COD_CURSO` (`COD_CURSO`);

ALTER TABLE `area_pesquisa`
  ADD PRIMARY KEY (`COD_AREA_PESQUISA`);

ALTER TABLE `complexidade`
  ADD PRIMARY KEY (`COD_COMPLEXIDADE`);

ALTER TABLE `curso`
  ADD PRIMARY KEY (`COD_CURSO`);

ALTER TABLE `linguagem`
  ADD PRIMARY KEY (`COD_LINGUAGEM`);

ALTER TABLE `problema`
  ADD PRIMARY KEY (`COD_PROBLEMA`);

ALTER TABLE `solucao`
  ADD PRIMARY KEY (`COD_SOLUCAO`),
  ADD KEY `fk_SOLUCAO_COD_ALGORITMO` (`COD_ALGORITMO`);

ALTER TABLE `usuario`
  ADD PRIMARY KEY (`COD_USUARIO`);


ALTER TABLE `algoritmo`
  MODIFY `COD_ALGORITMO` smallint(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

ALTER TABLE `aluno`
  MODIFY `COD_RA_ALUNO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111114323;

ALTER TABLE `area_pesquisa`
  MODIFY `COD_AREA_PESQUISA` smallint(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

ALTER TABLE `complexidade`
  MODIFY `COD_COMPLEXIDADE` tinyint(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

ALTER TABLE `curso`
  MODIFY `COD_CURSO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

ALTER TABLE `linguagem`
  MODIFY `COD_LINGUAGEM` tinyint(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

ALTER TABLE `problema`
  MODIFY `COD_PROBLEMA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

ALTER TABLE `solucao`
  MODIFY `COD_SOLUCAO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

ALTER TABLE `usuario`
  MODIFY `COD_USUARIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;


ALTER TABLE `algoritmo`
  ADD CONSTRAINT `fk_ALGORITMO_COD_AREA_PESQUISA` FOREIGN KEY (`COD_AREA_PESQUISA`) REFERENCES `area_pesquisa` (`COD_AREA_PESQUISA`),
  ADD CONSTRAINT `fk_ALGORITMO_COD_COMPLEXIDADE` FOREIGN KEY (`COD_COMPLEXIDADE`) REFERENCES `complexidade` (`COD_COMPLEXIDADE`),
  ADD CONSTRAINT `fk_ALGORITMO_COD_LINGUAGEM` FOREIGN KEY (`COD_LINGUAGEM`) REFERENCES `linguagem` (`COD_LINGUAGEM`),
  ADD CONSTRAINT `fk_ALGORITMO_COD_PROBLEMA` FOREIGN KEY (`COD_PROBLEMA`) REFERENCES `problema` (`COD_PROBLEMA`),
  ADD CONSTRAINT `fk_ALGORITMO_COD_RA_ALUNO` FOREIGN KEY (`COD_RA_ALUNO`) REFERENCES `aluno` (`COD_RA_ALUNO`);

ALTER TABLE `aluno`
  ADD CONSTRAINT `fk_ALUNO_COD_CURSO` FOREIGN KEY (`COD_CURSO`) REFERENCES `curso` (`COD_CURSO`);

ALTER TABLE `solucao`
  ADD CONSTRAINT `fk_SOLUCAO_COD_ALGORITMO` FOREIGN KEY (`COD_ALGORITMO`) REFERENCES `algoritmo` (`COD_ALGORITMO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;