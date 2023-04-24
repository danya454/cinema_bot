require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /cinema

    state: Start
        q!: $regex</start>
        a: Для запуска бота напишите "начать"

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}