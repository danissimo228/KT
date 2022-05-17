import requests
import json

def test_api():
    url = 'http://127.0.0.1:5000/json'    
    resp = requests.get(url)           
    assert resp.status_code == 200, 'Err'
    assert resp.json()["code"] == 1
    assert resp.json()["message"] == "Hello, World!"
    print(resp.text)


print(test_api())