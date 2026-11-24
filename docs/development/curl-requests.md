### Curl requests to retrieve data from the APIs

* To find game ID from Steam using search query: 
```bash
curl 'https://store.steampowered.com/api/storesearch?term=<search_query>&cc=LT'
```

* To get Steam Deck compatability:
```bash
curl 'https://store.steampowered.com/saleaction/ajaxgetdeckappcompatibilityreport?nAppID=<game_id>'
```

* To convert steam app id to ITAD game id:
Steam shop id: 61
```bash
curl -H 'ITAD-API-Key: <api_key>' https://api.isthereanydeal.com/lookup/id/shop/{shopId}/v1 -X POST -d '["app/<game_id>"]'
```

* To get prices:
```bash
curl -H 'ITAD-API-Key: <api_key>' https://api.isthereanydeal.com/games/prices/v3?country=LT -X POST -d '["<ITAD game_id>"]'
```
