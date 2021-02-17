package edu.escuelaing.arep.clima;
import spark.Request;
import spark.Response;
import static spark.Spark.port;
import static spark.Spark.get;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



/**
 * Hello world!
 * Author Verbo Camacho
 */
public class Clima<Static>
{
    private static Cache reservada=new Cache();

    public static void main(String[] args) throws Exception {

        port(getPort());
        get("/clima",(req, res)-> Datos(req, res));
        get("/cache",(req, res)-> PAg(req,res));


    }

    private static  Object Datos(Request req, Response res) throws MalformedURLException {
        String pr=req.queryString();
        //System.out.println(req.queryString());
        String[] inPut = pr.split("=");
        //System.out.println(variable.get("lugar"));
        String KEY="e3df546e99009f7020bcdb8239929f42";
        String city=inPut[1];
        if(reservada.getCache().contains(city)){
            String resultado = ("<!DOCTYPE html>"
                    + "<html>\n"
                    + "<body>"
                    + "<h2>Ciudad ya consultada intente con otra</h2>"
                    + "</body>"
                    + "</html>");

            return resultado;
        }else {
            agregar(city);
            String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + KEY;
            try {
                StringBuilder result = new StringBuilder();
                URL url = new URL(urlString);
                URLConnection Con = url.openConnection();
                BufferedReader rd = new BufferedReader(new InputStreamReader(Con.getInputStream()));
                String line;
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
                rd.close();
                //System.out.println(result);

                return result;

            } catch (IOException e) {
                return "";
            }
        }

        }

    private static String PAg(Request req, Response res) throws IOException{
        String ciudades=reservada.getCache().toString();
        String PAg = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<body>"
                + "<h2>"+ciudades+"</h2>"
                + "</body>\n"
                + "</html>";
        return PAg;
    }
    public static void agregar(String ciu){
        reservada.cache(ciu);
    }
    /**
     * @return the port 37000
     */
    public static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 37000;
    }


}
