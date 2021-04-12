Inicializar e operar o rabbitmq

Inicializar:

	cd /Volumes/SiriusSoftware/workspaceSTS/sirius-rabbit-compose
	docker-compose up -d

O resultado será este:

	jossemar@MBPJossemar sirius-rabbit-compose % docker-compose up -d              
	Creating network "sirius-rabbit-compose_default" with the default driver
	Creating volume "sirius-rabbit-compose_rabbitmq" with default driver
	Creating sirius-rabbit-compose_rabbitmq_1 ... done

Verificar o status:

	docker-compose ps 

Finalizar:

	docker-compose down

Acessar em http://localhost:15672 (utilizar usário e senha que estão configurados no docker-compose.yml)

Configurar exchange

	Acessar a aba Exchange
	Clicar em Add a new Exchange
		Em Name informar sirius-notificacao.exchange
		Deixar os demais campos com os valores default apresentados
		Clicar no botão Add exchange

Configurar queue

	Acessar a aba Queue
	Clicar em Add a new Queue
		Em Name informar sirius-notificacao.queue
		Deixar os demais campos com os valores default apresentados
		Clicar no botão Add queue
		
Fazer o bind da exchange com a queue

	Acessar a aba Exchange
	Na lista de exchanges clicar na sirius-notificacao.exchange
	Na seção Add binding from this exchange preencher os campos 
		To queue = sirius-notificacao.queue
		Routing Key = sirius-notificacao.routingkey
		Clicar no botão Bind
	