# [Observer_Assigment](https://drive.google.com/file/d/1wJ6B6CozCz73kIGmhznmeeGjSBNlzGja/view)

## Answers:

1. W opisanym systemie Producenci i Konsumenci są instancjami różnych klas. Czy istnieje
możliwość stworzenia klasy, która mogłaby występować w obu tych rolach? Jeżeli tak, to
jakich zmian wymagałoby to rozwiązanie?
**Prawdopodobnie dało by się, lecz nie wiem czy było by to optymalne, lecz nie potrafię wskazać aktualnie rozwiązania**

2. Jakie zmiany należałoby wprowadzić, aby umożliwić obsługę wielu Magazynów?
**Trzeba było by stworzyć jeszcze jedną klasę nadrzędną powedzimy centrum logistyczne**

3. Jakie powiązania istnieją pomiędzy wszystkimi obiektami w tym systemie? Jaki jest wpływ
Producentów i Konsumentów na siebie nawzajem?
**Powiązania są głównie jednostronne bo klasa producent i konsument wiąże się tylko z magazynem, a magazyn z tymi klasami. Więc powiązanie pomiędzy klasa konsument i producent dla nich nie istnieje wiec zmiany w jednej nie spowodują problemów drugiej**
  
