--liquibase formatted sql

--changeset ydshkn:2
--comment fill projects and steps

insert into projects(work_period, java_version, stack)
values ('2020 - 2022', 'java 8 || 11',
        '- Maven
        - GitLab, Trello
        - Spring (Core, MVC, Boot, Security)
        - JDBC, Hibernate/JPA
        - MySQL || PostgreSQL
        - Liquibase
        - JUnit, Mockito
        - Docker, Kubernates, Jenkins
        - Lombok
        - SLF4J, logback
        - Kuberbates, Docker
        - HTML, CSS, JS (JQuery, AJAX, Fetch, React.js), Bootstrap, Thymeleaf');



insert into projects(work_period, java_version, stack)
values ('2022 - по н. в.', 'java 8 || 11',
        '- Gradle
        - Jira, Bitbucket
        - Spring (Core, MVC, Boot, Security)
        - JDBC, Hibernate/JPA
        - OracleSQL | PostgreSQL
        - JOOQ
        - OPEN_API
        - Liquibase
        - JUnit, Mockito, Cucumber
        - Lombok
        - Kuberbates, Docker
        - Kafka
        - SLF4J
        - HTML, CSS, JS (JQuery, AJAX, Fetch, React.js), Bootstrap, Thymeleaf.');

insert into steps (title, year, description)
values ('Старый pascal', '2009',
        'Походил на свои первые курсы программирования на Pascal в течение 3 месяцев, суть программирования мне понравилась, а вот сами курсы - не особо)');

insert into steps (title, year, description)
values ('Открытие HTML', '2012',
        'В школе на уроке информатики узнал про HTML. С детства любил таблицы, а тут еще больше влюбился в их создание.');

insert into steps (title, year, description)
values ('Дизайнер обложек', '2015',
        'Начал увлекаться музыкой, для которой нужны были обложки, в итоге нашел новое хобби - графический дизайн.');

insert into steps (title, year, description)
values ('Старт фриланса', '2016',
        'Занятия дизайном привели к фрилансу - начал делать графический дизайн от логотипов до упаковок групп в соцсетях, параллельно готовясь к работе своей мечты в универе.');

insert into steps (title, year, description)
values ('"Работа мечты"', '2017',
        'Попал на работу своей мечты (нефтяником). Понял, что я совсем не там, решил построить более конкретный фундамент для жизни из своих текущих навыков.');

insert into steps (title, year, description)
values ('Веб-дизайнер', '2017',
        'Попробовал почти все, что было в дизайне на тот момент. Понял, что дизайн сайтов мне нравится больше всего. Начал увлекаться версткой и в основном с веб-дизайном.');

insert into steps (title, year, description)
values ('Чисто врстальщик', '2018',
        'Освоил HTML, CSS, SASS, самую базу JS, деплой всего этого и начал разрабатывать сайты полностью самостоятельно, параллельно осваивая контекстную и таргетированную рекламу.');

insert into steps (title, year, description)
values ('SMM и продажи', '2018',
        'Начал развиваться в SMM и прокачивать свой блог в соцсетях, клиентов стало больше, как и новых увлечений.');

insert into steps (title, year, description)
values ('Делегируем', '2018',
        'Моя работа нравилась людям, поэтому заказов стало больше. Пришел к тому, что верстка (не фронт) - самая дешевая часть сайта и начал больше делегировать.');

insert into steps (title, year, description)
values ('Своя команда', '2018',
        'Делегирование привело к тому, что вокруг меня оказалась команда из дизайнера, верстальщика, контекстолога, таргетолога. Стал работать больше как проджект-менеджер и копирайтер-прототипировщик.');

insert into steps (title, year, description)
values ('Выгорание и перемены', '2019',
        'Развелся, выгорел от фриланса, отошел от работы с клиентами, устроился проджект-менеджером в маркетинговое агентство, набравшись нереальному количеству нового опыта.');

insert into steps (title, year, description)
values ('Привет, Java', '2019',
        'В агентстве, там были прогнаны, начал параллельно осваивать программирование, пришел к тому, что оно мне нравится больше всего.');

insert into steps (title, year, description)
values ('Курс во время чумы', '2019',
        'Агентство было молодое и дело не пошло из-за разногласий, но было очень классно, много новых людей. Вернулся в маркетинг с клиентами для поддержки штанов и бесился от этого, заканчивая несколько курсов по программированию.');

insert into steps (title, year, description)
values ('Backend CaseDev', '2019',
        'Закончил с маркетингом, устроившись в мед компанию программистом, впервые попал в настоящий коллектив коллег-друзей-единомышленников. Поймал счастье в этой парадигме и решил двигаться отныне лишь в ней.');

insert into steps (title, year, description)
values ('Сбер Vega', '2022',
        'Закончил мед компанию, устроился в Сбер, в приятную команду с классными людьми, в очередной раз убедился, что приятно работать, развивая свои навыки.');

insert into steps (title, year, description)
values ('СРК и API', '2023',
        'Из-за появления синдрома раздраженного кишечника я перестал употреблять алкоголь и стал еще меньше видеться с людьми. Появилось новое хобби - делать домашние проекты и пробовать различные API.');

insert into steps (title, year, description)
values ('ЖКТ-хобби', '2023',
        'Для поиска нового подхода к питанию появились новые увлечения нутрициологией, гастроэнтерологией, устройством ЖКТ, диетологией, появилась новая большая многолетняя цель');

insert into steps (title, year, description)
values ('Подход и Java', '2023',
        'В ходе нового хобби увлекся Telegram Bot API, Google API, API организаций здравоохранения и начал писать самодельные парсеры. Немного освоил Python, понял, что функционально-ориентированные языки не по мне.');

insert into steps (title, year, description)
values ('Не фронт', '2023',
        'Начал увлекаться Vue3 для личных проектов, сделал сайт-резюме, понял, что фронтенд вообще не по мне.');

insert into steps (title, year, description)
values ('Dream-team ', '2024', 'После обоюдной договоренности с коллегами, начал искать новую dream-team.');
