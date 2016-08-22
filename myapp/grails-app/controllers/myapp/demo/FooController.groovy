package myapp.demo

class FooController {

    def index() {
        def data = ['a', 'b', 'c']
        respond data, model: [data: data]
    }
}
