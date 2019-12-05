
import { sleep } from"k6";
import http from "k6/http";

export let options = {
  duration: "1m",
  vus: 50,
  thresholds: {
    http_req_duration: ["p(95)<500"]
  }
};



export default function() {
  http.get("https://test-api.loadimpact.com/public/crocodiles/");
  sleep(3);
}