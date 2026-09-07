# Calorie Tracker

Приложение для учёта калорий и автоматического расчёта КБЖУ блюд на основе добавленных ингредиентов.

##  Функционал

- **Управление продуктами:** добавление продуктов с указанием КБЖУ на 100г
- **Создание блюд:** формирование блюд из списка продуктов с указанием граммовки
- **Автоматический расчёт КБЖУ:** система сама считает калории, белки, жиры и углеводы блюда
- **Хранение рецептов:** возможность добавить рецепт и фото блюда

##  Технологии

- **Java 17**
- **Spring Boot 4.1.1**
- **Spring Data JPA** (Hibernate)
- **PostgreSQL**
- **Lombok**
- **Maven**

## Установка и запуск

### Требования
- Java 17+
- PostgreSQL 18+
- Maven 4.0+

### Шаги

1. **Клонируйте репозиторий:**
   ```bash
   git clone https://github.com/Coffeemonkey04/calorie-tracker.git
   cd calorie-tracker

2. **Создайте базу данных в PostgreSQL:**
   ```bash
   CREATE DATABASE calorie_tracker;
3. **Настройте подключение в application.properties:**
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/calorie_tracker
   spring.datasource.username=postgres
   spring.datasource.password=ВАШ_ПАРОЛЬ
4. **Запустите приложение:**
   ```bash
   mvn spring-boot:run
5. **Откройте Swagger UI:** http://localhost:8080/swagger-ui.html

## API Endpoints
### Продукты
- `GET /api/products` — список всех продуктов
- `GET /api/products/{id}` — продукт по ID
- `POST /api/products` — создать продукт
### Блюда
- `GET /api/dishes` — список всех блюд
- `GET /api/dishes/{id}` — блюдо с рассчитанным КБЖУ
- `POST /api/dishes` — создать блюдо
- `POST /api/dishes/{dishId}/products/{productId}?grams=100` — добавить продукт в блюдо
