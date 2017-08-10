#Spring + maven boot hellworld

#test:
    curl http://localhost:51515
    curl -X POST "http://localhost:51515/greeting" -d '{"content": "test"}' -H "Content-Type: application/json"