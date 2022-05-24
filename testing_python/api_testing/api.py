from flask import Flask
# from testing_api import test_api


app = Flask(__name__)

@app.route('/json', methods=['POST', 'GET'])
def test_json():
    return '{"code": 1, "message": "Hello, World!" }'
    
# Run in HTTP
app.run(host='127.0.0.1', port='5000')  

# test_api()

