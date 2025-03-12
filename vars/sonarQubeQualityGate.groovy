def call() {
    timeout(time: 3, unit: "MINUTES") {
        def qg = waitForQualityGate abortPipeline: false
        if (qg.status != 'OK') {
            echo "Quality Gate failed: ${qg.status}"
        } else {
            echo "Quality Gate passed."
        }
    }
}
