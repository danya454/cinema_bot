require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /cinema

    state: Start
        q!: *start
        a: Для запуска бота напишите "привет"

    state: Hello
        intent!: /привет
        a: Здравствуйте. Я кинобот
        go!: /cinema/Help
        
        state: /cinema/Help
            a: Вот, чем я могу Вам помочь:
                Расписание фильмов/
                Цена/
                Количество залов/
                Время работы кафе/
        


    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}