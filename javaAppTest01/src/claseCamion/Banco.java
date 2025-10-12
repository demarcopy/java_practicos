package claseCamion;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cuenta> listaCuentas;
    private String nombre;
    
    public Banco(){
        this.setNombre("Sin nombre");
        this.listaCuentas = 
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public ArrayList<Cuenta> getListaCuentas(){
        return listaCuentas;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void agregarCuenta(Cuenta cuenta){
        this.getListaCuentas().add(cuenta);
    }
    
    public void eliminarCuenta(Cuenta cuenta){
        this.getListaCuentas().remove(cuenta);
    }

    public int cantidadCuentasSaldoAlto(){
        int cant = 0;
        for(Cuenta c : this.getListaCuentas()){
            if(c.getSaldo() > 10000){
                cant++;
            }
        }
        return cant;
    }
    
    public ArrayList<Cuenta> cuentasSinSaldo(){
        ArrayList<cuenta> lista = new ArrayList<>();
        
        Iterator<Cuenta> it this.getListaCuentas().iterator();
        Cuenta c;
        while(it.hasNext()){
            c = it.next();
            if(c.getSaldo() == 0){
                lista.add(c);
            }
        }
        
        return lista;
       
        }
    }

    public ArrayList<Cuenta> listaOrdenada(){
        Collections.sort(this.getListaCuentas());
        return this.getListaCuenta();
    }

    public class Criterio implements Comparator<Cuenta>{
        public int compare(Cuenta c1, Cuenta c2){
            int retorno = (int)c1.getSaldo() - c2.getSaldo();
            if(retorno == 0){
                retorno = c1.getNombre.compareTo(c2.getNombre());
            }
        }
    }

    public ArrayList<Cuenta> listaOrdenada2(){
        Collections.sort(this.getListaCuentas(), new Criterio() );
        return this.getListaCuenta();
    }


    public HashMap<Sucursal, Integer> totalSucursal(){
        HashMap<Sucursal, Integer> mapa = HasMap<Sucursal, Integer>();
        for(Cuenta c : this.getListaCuentas()){
            Sucursal suc = c.getSucursal();
            if(mapa.containsKey(suc)){
                mapa.put(suc, (int)(mapa.get(suc) + c.getSaldo()));
            }else{
                mapa.put(suc, (int)(c.getSaldo()));
            }

        }   

}
