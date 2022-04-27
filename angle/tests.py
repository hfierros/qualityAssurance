import requests

payload = {
    'x': 5, 
    'y': 0
    }
r = requests.get('http://localhost:8080/angle', params=payload)

print(payload)
print(r.content)

payload = {
    'x': 0, 
    'y': 5
    }
r = requests.get('http://localhost:8080/angle', params=payload)

print(payload)
print(r.content)

payload = {
    'x': 20, 
    'y': 21
    }
r = requests.get('http://localhost:8080/angle', params=payload)

print(payload)
print(r.content)

payload = {
    'x': 3, 
    'y': 4
    }
r = requests.get('http://localhost:8080/angle', params=payload)

print(payload)
print(r.content)