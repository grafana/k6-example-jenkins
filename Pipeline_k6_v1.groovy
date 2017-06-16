node {

    stage ("Build stuff") {
    }

    stage ("test") {
        env.K6CLOUD_TOKEN="INSERT_MY_TOKEN_HERE"
        if (isUnix()) {
            sh "k6 run --quiet -o cloud github.com/loadimpact/k6-jenkins-example/loadtests/main.js"
        } else {
            bat 'k6.exe run --quiet -o cloud github.com/loadimpact/k6-jenkins-example/loadtests/main.js'
        }
    }

    stage ("Done") {
    }
}