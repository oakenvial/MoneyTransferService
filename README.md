
# Сервис перевода денег
Сервис предоставляет интерфейс для перевода денег с одной карты на другую по заранее описанной спецификации.

## Front-end для тестирования
https://serp-ya.github.io/card-transfer/

## Спецификация
OpenAPI-спецификация расположена здесь:
src/main/resources/MoneyTransferServiceSpecification.yaml

## Особенности
По умолчанию приложение работает на порту 5500.
Включены настройки, разрешающие кросс-доменные запросы с https://serp-ya.github.io

## Примеры запросов
Пример успешного запроса:
POST http://localhost:5500/transfer
```
{
    "cardFromNumber": "1111111111111111",
    "cardFromValidTill": "10/26",
    "cardFromCVV": "111",
    "cardToNumber": "1111111111111112",
    "amount": {
        "value": "4",
        "currency": "EURO"
    }
}
```
Пример неуспешного запроса:
POST http://localhost:5500/transfer
```
{
    "cardFromNumber": "1111111111111119",
    "cardFromValidTill": "10/26",
    "cardFromCVV": "111",
    "cardToNumber": "1111111111111112",
    "amount": {
        "value": "4",
        "currency": "EURO"
    }
}
```

## Логирование
Все операции логируются в файл operations.log