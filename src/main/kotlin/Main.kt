import org.wasabi.app.AppServer

/**
 * Created by bruno on 9/19/15.
 */
public object Main {
    @JvmStatic fun main(args: Array<String>){
        var server = AppServer()

        server.get("/", { response.send("Hello World on Wasabi!") })

        server.start()
    }
}