#Spring + maven boot hellworld

#test:
    curl http://localhost:6000
    curl -X POST "http://localhost:6000/greeting" -d '{"person": {"name": "mike"}}' -H "Content-Type: application/json"
    curl -X POST "http://localhost:6000/echo" -d '[{"content": "test"}]' -H "Content-Type: application/json" 