Минимальный пример использования Dagger2 в качестве DI Android приложения

# Задание

- Написать `Module`, `AppComponent`, `Activity`, метод инициализации Component, которые производят инъекцию инстанса `Aplication` в обьект `Activity`
- Добавить `ActivityComponent`, который должен зависеть от `AppComponent`
- Вместо `Application` поставлять в активити `Presenter`, который принимает в конструктор `Application`. `Presenter` должен принадлежать скоупу `ActivityComponent`
- Разделить презентер на интерфейс и реализацию. Вместо `Presenter` поставлять в активити `PresenterInterface`

# Описание

Основные компоненты: 
- [ExampleModule](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/data/di/ExampleModule.kt) - глобальный модуль приложения, содержит Binds с Presenter
- [ExampleApp](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/ExampleApp.kt) - переопределение Application для использования Dagger2
- [MainActivity](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/MainActivity.kt) - главная Activity, содержит свойство componentActivity и инжектит presenter 

Scopes:
- [AppScope](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/data/di/scopes/AppScope.kt) - скоп-синглтон для всего приложения
- [ActivityScope](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/data/di/scopes/ActivityScope.kt) - скоп активити

Компоненты:
- [AppComponent](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/data/di/components/AppComponent.kt) - основной компонент, содержит фабрику для Application
- [ActivityComponent](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/data/di/components/ActivityComponent.kt) - комопнент Activity, содержит inject для MainActivity

Presenter:
- [PresenterInterface](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/ui/presenter/PresenterInterface.kt) - интерфейс презентера, определен в ActivityScope
- [Presenter](https://github.com/Shevikina/Dagger2Example/blob/main/app/src/main/java/com/example/dagger_example/ui/presenter/Presenter.kt) - реализация презентера, инжектит поле типа Application
