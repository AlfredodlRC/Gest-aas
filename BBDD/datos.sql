
INSERT INTO dimensiones_valoracion (pk,cod, nombre, definicion, descripcion)
VALUES (1,'D','Disponibilidad','Propiedad o cadimensiones_valoraciondimensiones_valoracionracterística de los activos consistente en que las entidades o procesos autorizados tienen acceso a los mismos cuando lo requieren. [UNE 71504:2008]','¿Qué importancia tendría que el activo no estuviera disponible?
Un activo tiene un gran valor desde el punto de vista de disponibilidad cuando si una amenaza afectara a su disponibilidad, las consecuencias serían graves.
Y recíprocamente, un activo carece de un valor apreciable desde el punto de vista de disponibilidad cuando puede no estar disponible frecuentemente y durante largos periodos de tiempo sin por ello causar mayor daño.
La disponibilidad es una característica que afecta a todo tipo de activos.
A menudo la disponibilidad requiere un tratamiento por escalones pues el coste de la indisponibilidad aumenta de forma no lineal con la duración de la interrupción, desde breves interrupciones sin importancia, pasando por interrupciones que causan daños considerables y llegando a interrupciones que no admiten recuperación: la organización está acabada.'),
(2,'I','Integridad de los datos','Propiedad o característica consistente en que el activo de información no ha sido alterado de manera no autorizada. [ISO/IEC 13335-1:2004]','¿Qué importancia tendría que los datos fueran modificados fuera de control?
Los datos reciben una alta valoración desde el punto de vista de integridad cuando su alteración, voluntaria o intencionada, causaría graves daños a la organización.
Y, recíprocamente, los datos carecen de un valor apreciable desde el punto de vista de integridad cuando su alteración no supone preocupación alguna.'),
(3,'C','Confidencialidad de la información','Propiedad o característica consistente en que la información ni se pone a disposición, ni se revela a individuos, entidades o procesos no autorizados. [UNE-ISO/IEC 27001:2007]','¿Qué importancia tendría que el dato fuera conocido por personas no autorizadas?
Los datos reciben una alta valoración desde el punto de vista de confidencialidad cuando su revelación causaría graves daños a la organización.
Y, recíprocamente, los datos carecen de un valor apreciable desde el punto de vista de confidencialidad cuando su conocimiento por cualquiera no supone preocupación alguna.'),
(4,'A','Autenticidad','Propiedad o característica consistente en que una entidad es quien dice ser o bien que
garantiza la fuente de la que proceden los datos. [UNE 71504:2008]','¿Qué importancia tendría que quien accede al servicio no sea realmente quien se cree?
La autenticidad de los usuarios de un servicio es lo contrario de la oportunidad de fraude o uso no autorizado de un servicio.
Así, un servicio recibe una elevada valoración desde el punto de vista de autenticidad cuando su prestación a falsos usuarios supondría un grave perjuicio para la organización.
Y, recíprocamente, un servicio carece de un valor apreciable desde el punto de vista de autenticidad cuando su acceso por cualquiera no supone preocupación alguna.
¿Qué importancia tendría que los datos no fueran realmente imputables a quien se cree?
Los datos reciben una elevada valoración desde el punto de vista de autenticidad del origen cuando un defecto de imputación causaría graves quebrantos a la organización. Típicamente, se habilita la oportunidad de repudio.
Y, recíprocamente, los datos carecen de un valor apreciable desde el punto de vista de autenticidad del origen cuando ignorar la fuente es irrelevante.'),
(5,'T','Trazabilidad','Propiedad o característica consistente en que las actuaciones de una entidad pueden ser imputadas exclusivamente a dicha entidad. [UNE 71504:2008]','¿Qué importancia tendría que no quedara constancia fehaciente del uso del servicio?
Abriría las puertas al fraude, incapacitaría a la Organización para perseguir delitos y podría suponer el incumplimiento de obligaciones legales.
¿Qué importancia tendría que no quedara constancia del acceso a los datos?
Abriría las puertas al fraude, incapacitaría a la Organización para perseguir delitos y podría suponer el incumplimiento de obligaciones legales.');

INSERT INTO criterio_po (pk,NIVEL,codigo, descripcion) VALUES 
(1,6,'6.pi1','probablemente afecte gravemente a un grupo de individuos'),
(2,6,'6.pi2','probablemente quebrante seriamente la ley o algún reglamento de protección de información personal'),
(3,5,'5.pi1','probablemente afecte gravemente a un individuo'),
(4,5,'5.pi2','probablemente quebrante seriamente leyes o regulaciones'),
(5,4,'4.pi1','probablemente afecte a un grupo de individuos'),
(6,4,'4.pi2','probablemente quebrante leyes o regulaciones'),
(7,3,'3.pi1','probablemente afecte a un individuo'),
(8,3,'3.pi2','probablemente suponga el incumplimiento de una ley o regulación'),
(9,2,'2.pi1','pudiera causar molestias a un individuo'),
(10,2,'2.pi2','pudiera quebrantar de forma leve leyes o regulaciones'),
(11,1,'1.pi1','pudiera causar molestias a un individuo');

INSERT INTO criterio_lpo (pk,NIVEL,codigo, descripcion) VALUES 
(1,9,'9.lro','probablemente cause un incumplimiento excepcionalmente grave de una ley o regulación'),
(2,7,'7.lro','probablemente cause un incumplimiento grave de una ley o regulación'),
(3,5,'5.lro','probablemente sea causa de incumplimiento de una ley o regulación'),
(4,3,'3.lro','probablemente sea causa de incumplimiento leve o técnico de una ley o regulación'),
(5,1,'1.lro','pudiera causar el incumplimiento leve o técnico de una ley o regulación');

INSERT INTO criterio_si (pk,NIVEL,codigo, descripcion) VALUES 
(1,10,'10.si','probablemente sea causa de un incidente excepcionalmente serio de seguridad o dificulte la investigación de incidentes excepcionalmente serios'),
(2,9,'9.si','probablemente sea causa de un serio incidente de seguridad o dificulte la investigación de incidentes serios'),
(3,7,'7.si','probablemente sea causa de un grave incidente de seguridad o dificulte la investigación de incidentes graves'),
(4,3,'3.si','probablemente sea causa de una merma en la seguridad o dificulte la investigación de un incidente'),
(5,1,'1.si','pudiera causar una merma en la seguridad o dificultar la investigación de un incidente');



INSERT INTO criterio_cei (pk,NIVEL,codigo, descripcion) VALUES 
(1,9,'9.cei.a','de enorme interés para la competencia'),
(2,9,'9.cei.b','de muy elevado valor comercial'),
(3,9,'9.cei.c','causa de pérdidas económicas excepcionalmente elevadas'),
(4,9,'9.cei.d','causa de muy significativas ganancias o ventajas para individuos u organizaciones'),
(5,9,'9.cei.e','constituye un incumplimiento excepcionalmente grave de las obligaciones contractuales relativas a la seguridad de la información proporcionada por terceros'),
(6,7,'7.cei.a','de alto interés para la competencia'),
(7,7,'7.cei.b','de elevado valor comercial'),
(8,7,'7.cei.c','causa de graves pérdidas económicas'),
(9,7,'7.cei.d','proporciona ganancias o ventajas desmedidas a individuos u organizaciones'),
(10,7,'7.cei.e','constituye un serio incumplimiento de obligaciones contractuales relativas a la seguridad de la información proporcionada por terceros'),
(11,3,'3.cei.a','de cierto interés para la competencia'),
(12,3,'3.cei.b','de cierto valor comercial'),
(13,3,'3.cei.c','causa de pérdidas financieras o merma de ingresos'),
(14,3,'3.cei.d','facilita ventajas desproporcionadas a individuos u organizaciones'),
(15,3,'3.cei.e','constituye un incumplimiento leve de obligaciones contractuales para mantener la seguridad de la información proporcionada por terceros'),
(16,2,'2.cei.a','de bajo interés para la competencia'),
(17,2,'2.cei.b','de bajo valor comercial'),
(18,1,'1.cei.a','de pequeño interés para la competencia'),
(19,1,'1.cei.b','de pequeño valor comercial'),
(20,0,'0.3','supondría pérdidas económicas mínimas');


INSERT INTO criterio_da (pk,NIVEL,codigo, descripcion) VALUES 
(1,9,'9.da','Probablemente cause una interrupción excepcionalmente seria de las actividades propias de la Organización con un serio impacto en otras organizaciones'),
(2,9,'9.da2','Probablemente tenga un serio impacto en otras organizaciones'),
(3,7,'7.da','Probablemente cause una interrupción seria de las actividades propias de la Organización con un impacto significativo en otras organizaciones'),
(4,7,'7.da2','Probablemente tenga un gran impacto en otras organizaciones'),
(5,5,'5.da','Probablemente cause la interrupción de actividades propias de la Organización con impacto en otras organizaciones'),
(6,5,'5.da2','Probablemente cause un cierto impacto en otras organizaciones'),
(7,3,'3.da','Probablemente cause la interrupción de actividades propias de la Organización'),
(8,1,'1.da','Pudiera causar la interrupción de actividades propias de la Organización');


INSERT INTO criterio_lpo (pk,NIVEL,codigo, descripcion) VALUES 
(1,9,'9.po','alteración seria del orden público'),
(2,6,'6.po','probablemente cause manifestaciones, o presiones significativas'),
(3,3,'3.po','causa de protestas puntuales'),
(4,1,'1.po','pudiera causar protestas puntuales');



INSERT INTO criterio_olm (pk,NIVEL,codigo, descripcion) VALUES 
(1,10,'10.olm','Probablemente cause un daño excepcionalmente serio a la eficacia o seguridad de la misión operativa o logística'),
(2,9,'9.olm','Probablemente cause un daño serio a la eficacia o seguridad de la misión operativa o logística'),
(3,7,'7.olm','Probablemente perjudique la eficacia o seguridad de la misión operativa o logística'),
(4,5,'5.olm','Probablemente merme la eficacia o seguridad de la misión operativa o logística más allá del ámbito local'),
(5,3,'3.olm','Probablemente merme la eficacia o seguridad de la misión operativa o logística (alcance local)'),
(6,1,'1.olm','Pudiera mermar la eficacia o seguridad de la misión operativa o logística (alcance local)');


INSERT INTO criterio_adm (pk,NIVEL,codigo, descripcion) VALUES 
(1,9,'9.adm','probablemente impediría seriamente la operación efectiva de la Organización, pudiendo llegar a su cierre'),
(2,7,'7.adm','probablemente impediría la operación efectiva de la Organización'),
(3,5,'5.adm','probablemente impediría la operación efectiva de más de una parte de la Organización'),
(4,3,'3.adm','probablemente impediría la operación efectiva de una parte de la Organización'),
(5,1,'1.adm','pudiera impedir la operación efectiva de una parte de la Organización');

INSERT INTO criterio_lg (pk,NIVEL,codigo, descripcion) VALUES 
(1,9,'9.lg.a','Probablemente causaría una publicidad negativa generalizada por afectar de forma excepcionalmente grave a las relaciones a las relaciones con otras organizaciones'),
(2,9,'9.lg.b','Probablemente causaría una publicidad negativa generalizada por afectar de forma excepcionalmente grave a las relaciones a las relaciones con el público en general'),
(3,7,'7.lg.a','Probablemente causaría una publicidad negativa generalizada por afectar gravemente a las relaciones con otras organizaciones'),
(4,7,'7.lg.b','Probablemente causaría una publicidad negativa generalizada por afectar gravemente a las relaciones con el público en general'),
(5,5,'5.lg.a','Probablemente sea causa una cierta publicidad negativa por afectar negativamente a las relaciones con otras organizaciones'),
(6,5,'5.lg.b','Probablemente sea causa una cierta publicidad negativa por afectar negativamente a las relaciones con el público'),
(7,3,'3.lg','Probablemente afecte negativamente a las relaciones internas de la Organización'),
(8,2,'2.lg','Probablemente cause una pérdida menor de la confianza dentro de la Organización'),
(9,1,'1.lg','Pudiera causar una pérdida menor de la confianza dentro de la Organización'),
(10,0,'0.4','no supondría daño a la reputación o buena imagen de las personas u organizaciones');

INSERT INTO criterio_crm (pk,NIVEL,codigo, descripcion) VALUES 
(1,8,'8.crm','Impida la investigación de delitos graves o facilite su comisión'),
(2,4,'4.crm','Dificulte la investigación o facilite la comisión de delitos');

INSERT INTO criterio_rto (pk,NIVEL,codigo, descripcion) VALUES 
(1,7,'(,7.rto','RTO < 4 horas'),
(2,4,'4.rto','4 horas < RTO < 1 día'),
(3,1,'1.rto','1 día < RTO < 5 días'),
(4,0,'0.rto','5 días < RTO');

INSERT INTO criterio_ibl_national (pk,NIVEL,codigo, descripcion) VALUES 
(1,10,'10.lbl','Secreto'),
(2,9,'9.lbl','Reservado'),
(3,8,'8.lbl','Confidencial'),
(4,7,'7.lbl','Confidencial'),
(5,6,'6.lbl','Difusión limitada'),
(6,5,'5.lbl','Difusión limitada'),
(7,4,'4.lbl','Difusión limitada'),
(8,3,'3.lbl','Difusión limitada'),
(9,2,'2.lbl','Sin clasificar'),
(10,1,'1.lbl','Sin clasificar');

INSERT INTO criterio_ibl_ue (pk,NIVEL,codigo, descripcion) VALUES 
(1,10,'10.ue','TRES SECRET UE'),
(2,9,'9.ue','SECRET UE'),
(3,8,'8.ue','CONFIDENTIEL UE'),
(4,7,'7.ue','CONFIDENTIEL UE'),
(5,6,'6.ue','RESTREINT UE'),
(6,5,'5.ue','RESTREINT UE'),
(7,4,'4.ue','RESTREINT UE'),
(8,3,'3.ue','RESTREINT UE');

INSERT INTO tipo_salvaguarda (pk,cod,nombre,descripcion,fk_superior) VALUES
(1,'H','Protecciones Generales','',NULL),
(2,'H.IA','Identificación y autenticación','',1),
(3,'H.AC','Control de acceso lógico','',1),
(4,'H.ST','Segregación de tareas','',1),
(5,'H.IR','Gestión de incidencias','',1),
(6,'H.tools','Herramientas de seguridad','',1),
(7,'H.tools.AV','Herramienta contra código dañino','',1),
(8,'H.tools.IDS','IDS/IPS: Herramienta de detección / prevención de intrusión','',1),
(9,'H.tools.CC','Herramienta de chequeo de configuración','',1),
(10,'H.tools.VA','Herramienta de análisis de vulnerabilidades','',1),
(11,'H.tools.TM','Herramienta de monitorización de tráfico','',1),
(12,'H.tools.DLP','DLP: Herramienta de monitorización de contenidos','',1),
(13,'H.tools.LA','Herramienta para análisis de logs','',1),
(14,'H.tools.HP','Honey net / honey pot','',1),
(15,'H.tools.SFV','Verificación de las funciones de seguridad','',1),
(16,'H.VM','Gestión de vulnerabilidades','',1),
(17,'H.AU','Registro y auditoría','',1),
(18,'D','Protección de la Información','',NULL),
(19,'D.A','Copias de seguridad de los datos (backup)','',18),
(20,'D.I','Aseguramiento de la integridad','',18),
(21,'D.C','Cifrado de la información','',18),
(22,'D.DS','Uso de firmas electrónicas','',18),
(23,'D.TS','Uso de servicios de fechado electrónico (time stamping)','',18),
(24,'K','Gestión de claves criptográficas','',NULL),
(25,'K.IC','Gestión de claves de cifra de información','',24),
(26,'K.DS','Gestión de claves de firma de información','',24),
(27,'K.disk','Gestión de claves para contenedores criptográficos','',24),
(28,'K.comms','Gestión de claves de comunicaciones','',24),
(29,'K.509','Gestión de certificados','',24),
(30,'S','Protección de los Servicios','',NULL),
(31,'S.A','Aseguramiento de la disponibilidad','',30),
(32,'S.start','Aceptación y puesta en operación','',30),
(33,'S.SC','Se aplican perfiles de seguridad','',30),
(34,'S.op','Explotación','',30),
(35,'S.CM','Gestión de cambios (mejoras y sustituciones)','',30),
(36,'S.end','Terminación','',30),
(37,'S.www','Protección de servicios y aplicaciones web','',30),
(38,'S.email','Protección del correo electrónico','',30),
(39,'S.dir','Protección del directorio','',30),
(40,'S.dns','Protección del servidor de nombres de dominio (DNS)','',30),
(41,'S.TW','Teletrabajo','',30),
(42,'S.voip','Voz sobre IP','',30),
(43,'SW','Protección de las Aplicaciones Informáticas','',NULL),
(44,'SW.A','Copias de seguridad (backup)','',43),
(45,'SW.start','Puesta en producción','',43),
(46,'SW.SC','Se aplican perfiles de seguridad','',43),
(47,'SW.op','Explotación / Producción','',43),
(48,'SW.CM','Cambios (actualizaciones y mantenimiento)','',43),
(49,'SW.end','Terminación','',43),
(50,'HW','Protección de los Equipos Informáticos','',NULL),
(51,'HW.start','Puesta en producción','',50),
(52,'HW.SC','Se aplican perfiles de seguridad','',50),
(53,'HW.A','Aseguramiento de la disponibilidad','',50),
(54,'HW.op','Operación HW.CM Cambios (actualizaciones y mantenimiento)','',50),
(55,'HW.end','Terminación HW.PCD Informática móvil','',50),
(56,'HW.print','Reproducción de documentos','',50),
(57,'HW.pabx','Protección de la centralita telefónica (PABX)','',50),
(58,'COM','Protección de las Comunicaciones','',NULL),
(59,'COM.start','Entrada en servicio','',58),
(60,'COM.SC','Se aplican perfiles de seguridad','',58),
(61,'COM.A','Aseguramiento de la disponibilidad','',58),
(62,'COM.aut','Autenticación del canal','',58),
(63,'COM.I','Protección de la integridad de los datos intercambiados','',58),
(64,'COM.C','Protección criptográfica de la confidencialidad de los datos intercambiados','',58),
(65,'COM.op','Operación','',58),
(66,'COM.CM','Cambios (actualizaciones y mantenimiento)','',58),
(67,'COM.end','Terminación','',58),
(68,'COM.internet','Internet: uso de, acceso a','',58),
(69,'COM.wifi','Seguridad Wireless (WiFi)','',58),
(70,'COM.mobile','Telefonía móvil','',58),
(71,'COM.DS','Segregación de las redes en dominios','',58),
(72,'IP','Puntos de interconexión: conexiones entre zonas de confianza','',NULL),
(73,'IP.SPP','Sistema de protección perimetral','',72),
(74,'IP.BS','Protección de los equipos de frontera','',72),
(75,'MP','Protección de los Soportes de Información','',72),
(76,'MP.A','Aseguramiento de la disponibilidad','',72),
(77,'MP.IC','Protección criptográfica del contenido','',72),
(78,'MP.clean','Limpieza de contenidos','',72),
(79,'MP.end','Destrucción de soportes','',72),
(80,'AUX','Elementos Auxiliares','',NULL),
(81,'AUX.A','Aseguramiento de la disponibilidad','',80),
(82,'AUX.start','Instalación','',80),
(83,'AUX.power','Suministro eléctrico','',80),
(84,'AUX.AC','Climatización','',80),
(85,'AUX.wires','Protección del cableado','',80),
(86,'L','Protección de las Instalaciones','',80),
(87,'L.design','Diseño','',NULL),
(88,'L.depth','Defensa en profundidad','',88),
(89,'L.AC','Control de los accesos físicos','',88),
(90,'L.A','Aseguramiento de la disponibilidad','',88),
(91,'L.end','Terminación','',88),
(92,'PS','Gestión del Personal','',NULL),
(93,'PS.AT','Formación y concienciación','',92),
(94,'PS.A','Aseguramiento de la disponibilidad','',92),
(95,'G','Organización','',NULL),
(96,'G.RM','Gestión de riesgos','',95),
(97,'G.plan','Planificación de la seguridad','',95),
(98,'G.exam','Inspecciones de seguridad','',95),
(99,'BC','Continuidad del negocio','',NULL),
(100,'BC.BIA','Análisis de impacto (BIA)','',99),
(101,'BC.DRP','Plan de Recuperación de Desastres (DRP)','',99),
(102,'E','Relaciones Externas','',NULL),
(103,'E.1','Acuerdos para intercambio de información y software','',102),
(104,'E.2','Acceso externo','',102),
(105,'E.3','Servicios proporcionados por otras organizaciones','',102),
(106,'E.4','Personal subcontratado','',102),
(107,'NEW','Adquisición / desarrollo','',NULL),
(108,'NEW.S','Servicios: Adquisición o desarrollo','',107),
(109,'NEW.SW','Aplicaciones: Adquisición o desarrollo','',107),
(110,'NEW.HW','Equipos: Adquisición o desarrollo','',107),
(111,'NEW.COM','Comunicaciones: Adquisición o contratación','',107),
(112,'NEW.MP','Soportes de Información: Adquisición','',107),
(113,'NEW.C','Productos certificados o acreditados','',107);

INSERT INTO escala_valor(pk,abreviadura,magnitud) VALUES
(1,'MB','muy bajo'),
(2,'B','bajo'),
(3,'M','medio'),
(4,'A','alto'),
(5,'MA','muy alto');

INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(1,'essential','Activos esenciales','',NULL),
(2,'info','información','',1),
(3,'adm','datos de interés para la administración pública','',1),
(4,'vr','datos vitales (registros de la organización)','Dícese de aquellos que son esenciales para la supervivencia de la Organización; es decir que su carencia o daño afectaría directamente a la existencia de la Organización. Se pueden identificar aquellos que son imprescindibles para que la Organización supere una situación de emergencia, aquellos que permiten desempeñar o reconstruir las misiones críticas, aquellos sustancian la naturaleza legal o los derechos financieros de la Organización o sus usuarios.',1),
(5,'per','datos de carácter personal','',1),
(6,'A','nivel alto','',5),
(7,'M','nivel medio','',5),
(8,'B','nivel bajo','',5),
(9,'classified','datos clasificados','Dícese de cualquier información concerniente a personas físicas identificadas o identificables. Los datos de carácter personal están regulados por leyes y reglamentos en cuanto afectan a las libertades públicas y los derechos fundamentales de las personas físicas, y especialmente su honor e intimidad personal y familiar.',1),
(10,'C','nivel confidencial o','',9),
(11,'R','difusión limitada o','',9),
(12,'UC','sin clasificar o','',9),
(13,'pub','de carácter público','Dícese de aquellos sometidos a normativa específica de control de acceso y distribución; es decir aquellos cuya confidencialidad es especialmente relevante. La tipificación de qué datos deben ser clasificados y cuales son las normas para su tratamiento, vienen determinadas por regulaciones sectoriales, por acuerdos entre organizaciones o por normativa interna.',1),
(14,'service','servicioo','',1),
(15,'arch','Arquitectura del sistema','Se trata de elementos que permiten estructurar el sistema, definiendo su arquitectura interna y sus relaciones con el exterior.',null),
(16,'sap','punto de acceso al servicio','Establece una frontera entre la prestación de un servicio (proveedor) y el usuario (consumidor). Los requisitos de seguridad del usuario se convierten en obligaciones del prestatario, mientras que los incidentes de seguridad en el proveedor repercuten en el usuario.',15),
(17,'ip','punto de interconexión','Establece una frontera inter-pares: cuando dos sistemas se interconectan para intercambiar información.',15),
(18,'ext','proporcionado por terceros','Establece una frontera inferior, cuando para la prestación de nuestros servicios recurrimos a un tercero.',15),
(19,'D','Datos / Información','Los datos son el corazón que permite a una organización prestar sus servicios. La información es un activo abstracto que será almacenado en equipos o soportes de información (normalmente agrupado como ficheros o bases de datos) o será transferido de un lugar a otro por los medios de transmisión de datos.',null),
(20,'files','ficheros (backup) copias de respaldo','',18),
(21,'conf','datos de configuración','Los datos de configuración son críticos para mantener la funcionalidad de las partes y del conjunto del sistema de información.',18),
(22,'int','datos de gestión interna','',18),
(23,'password','credenciales (ej. contraseñas)','',18),
(24,'auth','datos de validación de credenciales','',18),
(25,'acl','datos de control de acceso','',18),
(26,'log','registro de actividad','Los registros de actividad sustancian los requisitos de trazabilidad.',18),
(27,'source','código fuente [exe] código ejecutable [test] datos de prueba','',18),
(28,'K','Claves criptográficas','Las criptografía se emplea para proteger el secreto o autenticar a las partes. Las claves criptográficas, combinando secretos e información pública, son esenciales para garantizar el funcionamiento de los mecanismos criptográficos.',null);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(29,'info','protección de la información','',null),
(30,'encrypt','claves de cifra','',29);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(31,'shared_secret','secreto compartido (clave simétrica)','Por ejemplo, DES, 3-DES, AES, etc.',30),
(32,'public_encryption','clave pública de cifra (2)','Por ejemplo, RSA, Diffie-Hellman, curvas elípticas, etc.',30);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(33,'public_decryption','clave privada de descifrado','Por ejemplo, RSA, Diffie-Hellman, curvas elípticas, etc.',30),
(34,'sign','claves de firma','',29),
(35,'shared_secret','secreto compartido (clave simétrica)','',34);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(36,'public_signature','clave privada de firma)','Por ejemplo, RSA, Diffie-Hellman, curvas elípticas, etc.',34),
(37,'public_verification','clave pública de verificación de firma','Por ejemplo, RSA, Diffie-Hellman, curvas elípticas, etc.',34),
(38,'com','protección de las comunicaciones','',29),
(39,'channel','claves de cifrado del canal','',38),
(40,'authentication','claves de autenticación','',38);




INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(41,'verification','claves de verificación de autenticación','',38),
(42,'disk','cifrado de soportes de información','',29),
(43,'encrypt','claves de cifra','',42),
(44,'x509','certificados de clave pública','',29),
(45,'S','Servicios','Función que satisface una necesidad de los usuarios (del servicio). Esta sección contempla servicios prestados por el sistema',null),
(46,'anon','anónimo (sin requerir identificación del usuario)','',45),
(47,'pub','al público en general (sin relación contractual)','',45),
(48,'ext','a usuarios externos (bajo una relación contractual)','',45),
(49,'int','interno (a usuarios de la propia organización)','',45),
(50,'www','world wide web','',45);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(51,'telnet','acceso remoto a cuenta local','',45),
(52,'email','correo electrónico','',45),
(53,'file','almacenamiento de ficheros','',45),
(54,'ftp','transferencia de ficheros','',45),
(55,'edi','intercambio electrónico de datos','',45),
(56,'dir','servicio de directorio','Localización de personas (páginas blancas), empresas o servicios (páginas amarillas); permitiendo la identificación y facilitando los atributos que caracterizan al elemento determinado.',45),
(57,'idm','gestión de identidades','Servicios que permiten altas y bajas de usuarios de los sistemas, incluyendo su caracterización y activando los servicios de aprovisionamiento asociados a sus cambios de estado respecto de la organización.',45),
(58,'ipm','gestión de privilegios','',45),
(59,'pki','PKI - infraestructura de clave pública','Servicios asociados a sistemas de criptografía de clave pública, incluyendo especialmente la gestión de certificados.',45),
(60,'SW','Software - Aplicaciones informáticas','Con múltiples denominaciones (programas, aplicativos, desarrollos, etc.) este epígrafe se refiere a tareas que han sido automatizadas para su desempeño por un equipo informático. Las aplicaciones gestionan, analizan y transforman los datos permitiendo la explotación de la información para la prestación de los servicios.No preocupa en este apartado el denominado “código fuente” o programas que serán datos de interés comercial, a valorar y proteger como tales. Dicho código aparecería como datos.',null),
(61,'prp','desarrollo propio (in house)','',60),
(62,'sub','desarrollo a medida (subcontratado)','',60);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(63,'std','estándar (off the shelf)','',60),
(64,'browser','navegador web','',63),
(65,'www','servidor de presentación','',63),
(66,'app','servidor de aplicaciones','',63),
(67,'email_client','cliente de correo electrónico','',63),
(68,'email_server','servidor de correo electrónico','',63),
(69,'file','servidor de ficheros','',63);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(70,'dbms','sistema de gestión de bases de datos','',63),
(71,'tm','monitor transaccional','',63),
(72,'office','ofimática','',63),
(73,'av','anti virus','',63),
(74,'os','sistema operativo','',63);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(75,'hypervisor','gestor de máquinas virtuales','',63),
(76,'ts','servidor de terminales','',63),
(77,'backup','sistema de backup','',63);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(78,'HW','Equipamiento informático (hardware)','Dícese de los medios materiales, físicos, destinados a soportar directa o indirectamente los servicios que presta la organización, siendo pues depositarios temporales o permanentes de los datos,soporte de ejecución de las aplicaciones informáticas o responsables del procesado o la transmisión de datos.',null),
(79,'host','grandes equipos','Se caracterizan por haber pocos, frecuentemente uno sólo, ser económicamente gravosos y requerir un entorno específico para su operación. Son difícilmente reemplazables en caso de destrucción.',78),
(80,'mid','equipos medios','Se caracterizan por haber varios, tener un coste económico medio tanto de adquisición como de mantenimiento e imponer requerimientos estándar como entorno de operación. No es difícil reemplazarlos en caso de destrucción.',78),
(81,'pc','informática personal','Se caracterizan por ser multitud, tener un coste económico relativamente pequeño e imponer solamente unos requerimientos mínimos como entorno de operación. Son fácilmente reemplazables en caso de destrucción.',78),
(82,'mobile','informática móvil','Se caracterizan por ser equipos afectos a la clasificación como informática personal que, además, son fácilmente transportables de un sitio a otro, pudiendo estar tanto dentro del recinto propio de la organización como en cualquier otro lugar.',78),
(83,'pda','agendas electrónicas','',78),
(84,'vhost','equipo virtual','',78),
(85,'backup','equipamiento de respaldo','Son aquellos equipos preparados para hacerse cargo inmediato de los equipos en producción.',78),
(86,'peripheral','periféricos','',78),
(87,'print','medios de impresión','Dícese de impresoras y servidores de impresión.',86),
(88,'scan','escáneres','',86);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(89,'crypto','dispositivos criptográficos','',86),
(90,'bp','dispositivo de frontera (7)','Son los equipos que se instalan entre dos zonas de confianza.',78),
(91,'network','soporte de la red (8)','Dícese de equipamiento necesario para transmitir datos: routers, módems, etc.',78),
(92,'modem','módems','',91),
(93,'hub','concentradores','',91),
(94,'switch','conmutadores','',91),
(95,'router','encaminadores','',91),
(96,'bridge','pasarelas','',91),
(97,'firewall','cortafuegos','',91),
(98,'wap','punto de acceso inalámbrico','',91),
(99,'pabx','centralita telefónica[ipphone] teléfono IP','',78);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(100,'COM','Redes de comunicaciones','Incluyendo tanto instalaciones dedicadas como servicios de comunicaciones contratados a terceros; pero siempre centrándose en que son medios de transporte que llevan datos de un sitio a otro.',null),
(101,'PSTN','red telefónica','',100),
(102,'ISDN','rdsi (red digital)','',100),
(103,'X25','X25 (red de datos)','',100),
(104,'ADSL','ADSL','',100),
(105,'[pp','punto a punto','',100),
(106,'radio','comunicaciones radio','',100),
(107,'wifi','red inalámbrica','',100),
(108,'mobile','telefonía móvil','',100),
(109,'sat','por satélite','',100),
(110,'LAN','red local','',100),
(111,'MAN','red metropolitana','',100),
(112,'Internet','Internet','',100);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(113,'Media','Soportes de información','En este epígrafe se consideran dispositivos físicos que permiten almacenar información de forma permanente o, al menos, durante largos periodos de tiempo.',null),
(114,'electronic','electrónicos','',113),
	(115,'disk','discos','',114),
	(116,'vdisk','discos virtuales','',114),
	(117,'san','almacenamiento en red','',114),
	(118,'disquette','disquetes','',114),
	(119,'cd','cederrón (CD-ROM)','',114),
	(120,'usb','memorias USB','',114),
	(121,'dvd','DVD','',114),
	(122,'tape','cinta magnética','',114),
	(123,'mc','tarjetas de memoria','',114),
	(124,'ic','tarjetas inteligentes','',114),
(125,'non_electronic','no electrónicos','',113),
	(126,'[printed','material impreso','',125),
	(127,'tape','cinta de papel','',125),
	(128,'film','microfilm','',125),
	(129,'cards','tarjetas perforadas','',125);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(130,'L','Instalaciones','En este epígrafe entran los lugares donde se hospedan los sistemas de información y comunicaciones.',null),
(131,'site','recinto','',129),
(132,'building','edificio','',129),
(133,'local','cuarto','',129),
(134,'mobile','plataformas móviles','',129),
	(135,'car','vehículo terrestre: coche, camión, etc.','',133),
	(136,'plane','vehículo aéreo: avión, etc.','',133),
	(137,'ship','vehículo marítimo: buque, lancha, etc.','',133),
	(138,'shelter','contenedores','',133);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(139,'channel','canalización','',129),
(140,'backup','instalaciones de respaldo','',129),
(141,'P','Personal','En este epígrafe aparecen las personas relacionadas con los sistemas de información.',null),
(142,'ue','usuarios externos','',140),
(143,'ui','usuarios internos','',140),
(144,'op','operadores','',140),
(145,'adm','administradores de sistemas','',140),
(146,'com','administradores de comunicaciones','',140);
INSERT INTO tipo_activo (pk,cod,nombre,descripcion,fk_superior) VALUES
(147,'dba','administradores de BBDD','',140),
(148,'sec','administradores de seguridad','',140),
(149,'des','desarrolladores / programadores','',140),
(150,'sub','subcontratas','',140),
(151,'prov','proveedores','',140);


INSERT INTO tipo_amenaza (pk,cod,nombre,descripcion,fk_superior) VALUES
(1,'','','',NULL);




INSERT INTO rel_tipo_activo_tipo_amenaza (pk,fk_tipo_activo,fk_tipo_amenaza) VALUES
(0,0,0);
INSERT INTO rel_tipo_amenaza_dimensiones (pk,fk_tipo_amenaza,fk_dimension) VALUES
(0,0,0);




INSERT INTO escala_riesgo(pk,abreviadura,magnitud) VALUES
(1,'MB','muy despreciabe'),
(2,'B','bajo'),
(3,'M','apreciable'),
(4,'A','importante'),
(5,'MA','crítico');
INSERT INTO escala_probabilidad(pk,abreviadura,magnitud) VALUES
(1,'MB','muy raro'),
(2,'B','poco probable'),
(3,'M','posible'),
(4,'A','probable'),
(5,'MA','prácticamente seguro');
INSERT INTO escala_impacto(pk,abreviadura,magnitud) VALUES
(1,'MB','muy bajo'),
(2,'B','bajo'),
(3,'M','medio'),
(4,'A','alto'),
(5,'MA','muy alto');

