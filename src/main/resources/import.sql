INSERT INTO type_user(create_state, state, description, name) VALUES (NOW(),NOW(),'ADMINISTRACION TOTAL DEL SITIO','ADMINISTRADOR');
INSERT INTO type_user(create_state, state, description, name) VALUES (NOW(),NOW(),'TIENE OPCIONES DE ESTAISTICAS Y DE ANALISIS','GERENTE');
INSERT INTO type_user(create_state, state, description, name) VALUES (NOW(),NOW(),'ACCESO A LAS PARTES DE ANALISIS DEL SISTEMA','ANALISTAS OPERACIONALES');
INSERT INTO type_user(create_state, state, description, name) VALUES (NOW(),NOW(),'OPERACIONES DE EJECUCION DE PROCESOS EN GENERAL','EJECUCION');
INSERT INTO type_user(create_state, state, description, name) VALUES (NOW(),NOW(),'INTERFAZ PERSONALIZA DE VENTAS Y PROGRESO','VENDEDORES');
INSERT INTO type_user(create_state, state, description, name) VALUES (NOW(),NOW(),'SISTEMA PARA CONTROL DE INVENTARIO','BODEGUEROS');
INSERT INTO type_user(create_state, state, description, name) VALUES (NOW(),NOW(),'INGRESO A LA PARTE DE CONTABILIDAD','SECRETARIA');

INSERT INTO state_user(create_state, state, description, name) VALUES (NOW(),NOW(),'USUARIO ACTIVO','ACTIVO');
INSERT INTO state_user(create_state, state, description, name) VALUES (NOW(),NOW(),'USUARIO EN ESTADO ANULADO','ANULADO');
INSERT INTO state_user(create_state, state, description, name) VALUES (NOW(),NOW(),'USUARIO TEMPORALMENTE INACTIVO','INACTIVO');
INSERT INTO state_user(create_state, state, description, name) VALUES (NOW(),NOW(),'USUARIO QUE NO PASO POR LA SELECCION','RECHAZADO');
INSERT INTO state_user(create_state, state, description, name) VALUES (NOW(),NOW(),'USUARIO A LA ESPERA DE APROVACION','INGRESADO');

INSERT INTO state_person(create_state, state, description, name) VALUES (NOW(),NOW(),'PERSONA ACTUALEMENTE ACTIVA DENTRO DE LA EMPRESA','ACTIVA');
INSERT INTO state_person(create_state, state, description, name) VALUES (NOW(),NOW(),'PERSONA SE ENCUENTRA ANULADA','ANULADA');
INSERT INTO state_person(create_state, state, description, name) VALUES (NOW(),NOW(),'SIN PERMISOS DE FORMA TEMPORAL','INACTIVA');
INSERT INTO state_person(create_state, state, description, name) VALUES (NOW(),NOW(),'SIN APROVACION PARA EL INGRESO A LA EMPRESA','RECHAZADA');
INSERT INTO state_person(create_state, state, description, name) VALUES (NOW(),NOW(),'PERSONA QUE ACTUALMENTE ESTA INGRESADA EN EL SISTEMA PERO NO SE ENCUENTRA APROVADA','INGRESADA');

INSERT INTO type_person(create_state, state, description, name) VALUES (NOW(),NOW(),'PERSONA JURIDICA','JURIDICO');
INSERT INTO type_person(create_state, state, description, name) VALUES (NOW(),NOW(),'PERSONA NATURAL','NATURAL');
INSERT INTO type_person(create_state, state, description, name) VALUES (NOW(),NOW(),'PERSONA INVENTADA','INVENTADO');
INSERT INTO type_person(create_state, state, description, name) VALUES (NOW(),NOW(),'TIPO DESCONOCIDO, EVITAR ESTE TIPO DE PERSONA','OTRO');

INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'CATEGORIA DE LACTEOS','LACTEOS');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'CATEGORIA DE ABARROTES','ABARROTES');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'CATEGORIA DE LAS BEBIDAS','GASEOSAS');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'CATEGORIA DE JUGOS LIQUIDOS','JUGOS LIQUIDOS');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'GOLOSINAS VARIAS','GOLOSINAS');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'PASTELES Y PAN','PANADERIA');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'CECINAS Y QUESOS','CECINAS');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'VERDURAS Y FRUTAS','VERURERIA');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'CONGELADOS VARIOS','CONGELADOS');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'CARNES CONGELADAS','CARNES');
INSERT INTO category(create_state, state, description, name) VALUES (NOW(),NOW(),'CARNES AL NATURAL','CARNICERIA');

INSERT INTO type_document(create_state, state, description, name) VALUES (NOW(),NOW(),'COMPRAS O VENTAS DE TIPO BOLETA','BOLETA');
INSERT INTO type_document(create_state, state, description, name) VALUES (NOW(),NOW(),'COMPRAS O VENTAS DE TIPO FACTURA','FACTURA');
INSERT INTO type_document(create_state, state, description, name) VALUES (NOW(),NOW(),'EVITAR ESTE TIPO DE PAGO','OTROS');