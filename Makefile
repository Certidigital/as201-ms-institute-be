.PHONY: build test run logs stop start down

include dev.env
export


build:
	mvnw.cmd clean package
	make build-image

test:
	mvnw test

run:
	make down
	docker-compose up --build -d
	make logs

logs:
	docker-compose logs -f

stop:
	docker-compose stop

start:
	docker-compose start
	make logs

restart:
	docker-compose restart
	make logs

down:
	docker-compose down

build-image:
	docker build . -t flavioillanes/as201-ms-institute:v24

push-image:
	make build
	docker push flavioillanes/as201-ms-institute:v24