import requests
import json
from requests_toolbelt import MultipartEncoder

api_key = "f9c15e6710msh6557edc269cc09ap11e1ccjsndcdf7390ff2c"

headers = {
	"api_key": api_key,
	"X-RapidAPI-Host": "petstore109.p.rapidapi.com",
	"X-RapidAPI-Key": api_key
}

post_headers = {
	"content-type": "application/json",
	"api_key": "f9c15e6710msh6557edc269cc09ap11e1ccjsndcdf7390ff2c",
	"X-RapidAPI-Host": "petstore109.p.rapidapi.com",
	"X-RapidAPI-Key": "f9c15e6710msh6557edc269cc09ap11e1ccjsndcdf7390ff2c"
}

def get_user_by_name(headers, name):
    res = requests.get(f"https://petstore109.p.rapidapi.com/user/{name}", headers=headers)
    status = res.status_code
    result = res.text
    try:
        result = res.json()
    except: 
        result = json.decoder.JSONDecodeError
    return status, result

def create_user(headers, id=0, name="", firstname="", lastname="", email="", password="", phone="", userStatus=0):

    data = {
        "id": id,
        "username": name,
        "firstName": firstname,
        "lastName": lastname,
        "email": email,
        "password": password,
        "phone": phone,
        "userStatus": userStatus
    }

    res = requests.post("https://petstore109.p.rapidapi.com/user", headers=headers, json=data)
    status = res.status_code
    result = res.text
    try:
        result = res.json()
    except: 
        result = json.decoder.JSONDecodeError
    return status, result

def update_user(headers, id=0, name="", firstname="", lastname="", email="", password="", phone="", userStatus=0):

    data = {
        "id": id,
        "username": name,
        "firstName": firstname,
        "lastName": lastname,
        "email": email,
        "password": password,
        "phone": phone,
        "userStatus": userStatus
    }

    res = requests.put(f"https://petstore109.p.rapidapi.com/user/{name}", headers=headers, json=data)
    status = res.status_code
    result = res.text
    try:
        result = res.json()
    except: 
        result = json.decoder.JSONDecodeError
    return status, result


def delete_user(headers, name: str):
    res = requests.delete(f"https://petstore109.p.rapidapi.com/user/{name}", headers=headers)
    status = res.status_code
    result = res.text
    try:
        result = res.json()
    except: 
        result = json.decoder.JSONDecodeError
    return status, result



# print(get_user_by_name(headers, "fsfdpdgojsdo"))
# print(create_user(post_headers, name=False))
print(update_user(post_headers, id=5, name="user1"))
# print(delete_user(headers, "user1"))