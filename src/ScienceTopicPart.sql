-- drop database if exists ScienceTopicPart;
-- create database ScienceTopicPart; 
USE ScienceTopicPart;

/*!40101 SET character_set_client = utf8 */;

DROP TABLE IF EXISTS ScientistScienceTopic;
DROP TABLE IF EXISTS ProfessorScienceTopic;
DROP TABLE IF EXISTS Scientist;
DROP TABLE IF EXISTS ScienceTopic;
DROP TABLE IF EXISTS Department;

CREATE TABLE Department( 
  idDep VARCHAR(255) PRIMARY KEY,
  nameDep VARCHAR(15) NOT NULL,
  telDep VARCHAR(13) NOT NULL
);

CREATE TABLE ScienceTopic( 
  idST VARCHAR(255) PRIMARY KEY,
  nameST VARCHAR(30) NOT NULL,
  nameCust VARCHAR(30) NOT NULL,
  startDate VARCHAR(13) NOT NULL,
  finishDate VARCHAR(13) NOT NULL,
  idDep VARCHAR(255) NOT NULL,
  FOREIGN KEY (idDep) REFERENCES Department(idDep)
);

-- Створення таблиці ScientistDaoImpl , яка є відображенням сутностей Науковець, Магістр, Аспірант та Викладач
-- Додано атрибут роль, яка буде визначати ким є цей Науковець - Магістром, Аспірантом чи Викладачем
-- Атрибути що були обовязковими для Магістра , для Аспіранта, для Викладача - для Науковця є необовзяковими
-- Обовзяковими є лише атрибути що були обовязковими для науковця тобто id, прізвище, імя та стать
-- Так як науковцями є аспірант, магістри або викладач, що навчалися, викладаюсь, навчаються наконкретній кафедрі, створено атрибут що є зовнішнім ключем що відповідає id Кафедри - тобто ScientistDaoImpl обовязково звязаний з однією кафедрою
-- Так як викладач керує аспірантом або магістром, а в нашому випадку і викладач , і магістр, і  аспірант є науковцями - то науковець може керувати над науковцями - тому в нас є рекурсивний звязок , тому створено атрибут що є зовнішнім ключем що відповідає id Науковця - тобто ScientistDaoImpl може керувати ScientistDaoImpl-ами

CREATE TABLE Scientist( 
  idScientist VARCHAR(255) PRIMARY KEY,
  surname VARCHAR(15) NOT NULL,
  tel VARCHAR(13) NOT NULL,
  sex VARCHAR(6),
  topicMas VARCHAR(15),
  startDateMas VARCHAR(15),
  finishDateMas VARCHAR(15),
  finishingReasonMas VARCHAR(15),
  topicAsp VARCHAR(15),
  startDateAsp VARCHAR(15),
  finishDateAsp VARCHAR(15),
  presentDateAsp VARCHAR(15),
  positionProf VARCHAR(15),
  rankProf VARCHAR(15),
  startWorkProf VARCHAR(15),
  roleScientist VARCHAR(15) NOT NULL,
  idDep VARCHAR(255) NOT NULL,
  FOREIGN KEY (idDep) REFERENCES Department(idDep)
);

CREATE TABLE ScientistScienceTopic( 
  id VARCHAR(255) PRIMARY KEY,
  nameWork VARCHAR(15) NOT NULL,
  startDate VARCHAR(13) NOT NULL,
  finishDate VARCHAR(13) NOT NULL,
  idScientist VARCHAR(255) NOT NULL,
  idST VARCHAR(255) NOT NULL,
  FOREIGN KEY (idScientist) REFERENCES Scientist(idScientist),
  FOREIGN KEY (idST) REFERENCES ScienceTopic(idST)
);

CREATE TABLE ProfessorScienceTopic( 
  id VARCHAR(255) PRIMARY KEY,
  startDate VARCHAR(13) NOT NULL,
  finishDate VARCHAR(13) NOT NULL,
  idScientist VARCHAR(255) NOT NULL,
  idST VARCHAR(255) NOT NULL,
  FOREIGN KEY (idScientist) REFERENCES Scientist(idScientist),
  FOREIGN KEY (idST) REFERENCES ScienceTopic(idST)
);

/* Departments creation */
INSERT INTO Department VALUES (1, 'Mathematics', '+380445678459');
INSERT INTO Department VALUES (2, 'Multimedia', '+380444329075');
INSERT INTO Department VALUES (3, 'AI', '+380440987564');

/* Science topics creation */
INSERT INTO ScienceTopic VALUES (1, 'Algebra', 'Yarmolenko', '17-12-2018', '17-12-2018', 1);
INSERT INTO ScienceTopic VALUES (2, 'Geometry', 'Todorenko','17-12-2018', '17-12-2018', 1);
INSERT INTO ScienceTopic VALUES (3, 'Design', 'Cherkashina', '17-12-2018', '17-12-2018', 2);
INSERT INTO ScienceTopic VALUES (4, 'VideoReduction', 'Ishenko', '17-12-2018', '17-12-2018', 2);
INSERT INTO ScienceTopic VALUES (5, 'Market Searching', 'Shtanko', '17-12-2018', '17-12-2018', 3);
INSERT INTO ScienceTopic VALUES (6, 'Voice Recognition', 'Snigur', '17-12-2018', '17-12-2018', 3);

/* Professor creation */
INSERT INTO Scientist(idScientist, surname, tel, sex, positionProf, rankProf, startWorkProf, roleScientist, idDep) VALUES (1, 'Bublik', '+380972748326', 'male', 'Director', 'Professor', '17-12-2018', 'Professor', 2);
INSERT INTO Scientist(idScientist, surname, tel, sex, positionProf, rankProf, startWorkProf, roleScientist, idDep) VALUES (4, 'Kryviy', '+380973218326', 'male', 'Teacher', 'Professor', '17-12-2018', 'Professor', 3);
/* Aspirant creation */
INSERT INTO Scientist(idScientist, surname, tel, sex, topicAsp, startDateAsp, finishDateAsp, presentDateAsp, roleScientist, idDep) VALUES (2, 'Sinitsin', '+380972419293', 'male', 'Geo Warm', '17-12-2019', '17-12-2018', '17-12-2018', 'Aspirant', 2);
/* Master creation */
INSERT INTO Scientist(idScientist, surname, tel, sex, topicMas, startDateMas, finishDateMas, finishingReasonMas, roleScientist, idDep) VALUES (3, 'Sydorenko', '+380972434793', 'male', 'Bio Mech', '17-12-2018', '17-12-2018', 'Graduated.', 'Master', 2);

/* Working relations creation */
INSERT INTO ScientistScienceTopic VALUES (1, 'Moon Walk','17-12-2018', '17-12-2018',1, 3);

/* Managing relations creation */
INSERT INTO ProfessorScienceTopic VALUES (1, '17-12-2018', '17-12-2018', 1, 3);
