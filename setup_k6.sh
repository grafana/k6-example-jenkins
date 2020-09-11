#!/bin/bash
set -ex

install_k6() {
    sudo apt-get update
    sudo apt-get install dirmngr --install-recommends
    sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys 379CE192D401AB61
    echo "deb https://dl.bintray.com/loadimpact/deb stable main" | sudo tee -a /etc/apt/sources.list
    sudo apt-get update
    sudo apt-get install k6
}

main() {
    install_k6
}

main "$@"