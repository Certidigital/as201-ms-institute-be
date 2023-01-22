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
	make build
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
	docker build . -t gcr.io/envi-374600/as201-ms-institute:v5

push-image:
	make build
	docker push gcr.io/envi-374600/as201-ms-institute:v5