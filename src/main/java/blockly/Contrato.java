package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Contrato {

public static final int TIMEOUT = 300;

/**
 *
 * @param idColaborador
 * @param chaveContrato
 * @param idContrato
 *
 * @author Ícaro Antunes
 * @since 14/06/2023, 09:08:00
 *
 */
public static Var Executar(@ParamMetaData(description = "idColaborador", id = "2f07763d") Var idColaborador, @ParamMetaData(description = "chaveContrato", id = "655d90d5") Var chaveContrato, @ParamMetaData(description = "idContrato", id = "038859ea") Var idContrato) throws Exception {
 return new Callable<Var>() {

   private Var mapaGlobal = Var.VAR_NULL;
   private Var getSalarioColaboradorEscolhido = Var.VAR_NULL;
   private Var descontoImposto = Var.VAR_NULL;
   private Var beneficio = Var.VAR_NULL;
   private Var salarioDescontado = Var.VAR_NULL;

   public Var call() throws Exception {
    mapaGlobal =
    cronapi.map.Operations.createObjectMap();
    if (
    Var.valueOf(chaveContrato.equals(
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.TipoContrato"),Var.valueOf("select \n	t.id \nfrom \n	TipoContrato t \nwhere \n	t.tipoDoContrato = \'CLT\'")))))).getObjectAsBoolean()) {
        getSalarioColaboradorEscolhido =
        cronapi.list.Operations.getFirst((
        cronapi.database.Operations.query(Var.valueOf("app.entity.Colaborador"),Var.valueOf("select \n	c.cargo.salarioBase \nfrom \n	Colaborador c \nwhere \n	c.id = :id"),Var.valueOf("id",idColaborador))));
        descontoImposto =
        cronapi.math.Operations.multiply(getSalarioColaboradorEscolhido,
        Var.valueOf(0.1));
        beneficio =
        cronapi.math.Operations.multiply(getSalarioColaboradorEscolhido,
        Var.valueOf(0.23));
        salarioDescontado =
        cronapi.math.Operations.sum(
        cronapi.math.Operations.subtract(getSalarioColaboradorEscolhido,descontoImposto),beneficio);
        mapaGlobal =
        cronapi.map.Operations.createObjectMapWith(Var.valueOf("desconto",descontoImposto) , Var.valueOf("salarioDescontado",salarioDescontado) , Var.valueOf("beneficio",beneficio));
    } else if (
    Var.valueOf(chaveContrato.equals(
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.TipoContrato"),Var.valueOf("select \n	t.id \nfrom \n	TipoContrato t  \nwhere \n	t.tipoDoContrato = \'PJ\'")))))).getObjectAsBoolean()) {
        getSalarioColaboradorEscolhido =
        cronapi.list.Operations.getFirst((
        cronapi.database.Operations.query(Var.valueOf("app.entity.Colaborador"),Var.valueOf("select \n	c.cargo.salarioBase \nfrom \n	Colaborador c \nwhere \n	c.id = :id"),Var.valueOf("id",idColaborador))));
        descontoImposto =
        Var.valueOf(0);
        beneficio =
        cronapi.math.Operations.multiply(getSalarioColaboradorEscolhido,
        Var.valueOf(0.1));
        salarioDescontado =
        cronapi.math.Operations.sum(
        cronapi.math.Operations.subtract(getSalarioColaboradorEscolhido,descontoImposto),beneficio);
        mapaGlobal =
        cronapi.map.Operations.createObjectMapWith(Var.valueOf("desconto",descontoImposto) , Var.valueOf("salarioDescontado",salarioDescontado) , Var.valueOf("beneficio",beneficio));
    } else if (
    Var.valueOf(chaveContrato.equals(
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.TipoContrato"),Var.valueOf("select \n	t.id \nfrom \n	TipoContrato t  \nwhere \n	t.tipoDoContrato = \'EST\'")))))).getObjectAsBoolean()) {
        getSalarioColaboradorEscolhido =
        cronapi.list.Operations.getFirst((
        cronapi.database.Operations.query(Var.valueOf("app.entity.Colaborador"),Var.valueOf("select \n	c.cargo.salarioBase \nfrom \n	Colaborador c  \nwhere \n	c.id = :id"),Var.valueOf("id",idColaborador))));
        descontoImposto =
        Var.valueOf(0);
        beneficio =
        Var.valueOf(0);
        salarioDescontado =
        cronapi.math.Operations.sum(
        cronapi.math.Operations.subtract(getSalarioColaboradorEscolhido,descontoImposto),beneficio);
        mapaGlobal =
        cronapi.map.Operations.createObjectMapWith(Var.valueOf("desconto",descontoImposto) , Var.valueOf("salarioDescontado",salarioDescontado) , Var.valueOf("beneficio",beneficio));
    } else {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("São válidos apenas: CLT, PJ e ESTAGIO"));
    }
    return mapaGlobal;
   }
 }.call();
}

/**
 *
 * @param item
 * @param idContrato
 *
 * @author Ícaro Antunes
 * @since 14/06/2023, 09:08:00
 *
 */
public static Var atualizar(@ParamMetaData(description = "item", id = "012b85a7") Var item, @ParamMetaData(description = "idContrato", id = "1b4f3386") Var idContrato) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Contrato"), Var.valueOf("update \n	Contrato  \nset \n	beneficios = :beneficios, \n	descontos = :descontos, \n	salarioFinal = :salarioFinal \nwhere \n	id = :id"),Var.valueOf("beneficios",
    cronapi.map.Operations.getMapField(item,
    Var.valueOf("beneficio"))),Var.valueOf("descontos",
    cronapi.map.Operations.getMapField(item,
    Var.valueOf("desconto"))),Var.valueOf("salarioFinal",
    cronapi.map.Operations.getMapField(item,
    Var.valueOf("salarioDescontado"))),Var.valueOf("id",idContrato));
    return Var.VAR_NULL;
   }
 }.call();
}

}

