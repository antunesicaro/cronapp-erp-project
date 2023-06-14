window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Colaborador = window.blockly.js.blockly.Colaborador || {};

/**
 * @function confirmaTroca
 *
 *
 *
 *
 * @author Ícaro Antunes
 * @since 06/06/2023, 11:13:29
 *
 */
window.blockly.js.blockly.Colaborador.confirmaTrocaArgs = [];
window.blockly.js.blockly.Colaborador.confirmaTroca = async function() {

  //
  this.cronapi.screen.changeValueOfField("Colaborador.active.salarioBaseMaisSalarioCargo", this.cronapi.screen.getValueOfField("CargoCombo.active.salarioBase"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("Colaborador"));
}

/**
 * @function trocarValorDoCampoSalario
 *
 *
 *
 *
 * @author Ícaro Antunes
 * @since 06/06/2023, 11:13:29
 *
 */
window.blockly.js.blockly.Colaborador.trocarValorDoCampoSalarioArgs = [];
window.blockly.js.blockly.Colaborador.trocarValorDoCampoSalario = async function() {

  //
  (await this.cronapi.client('cronapi.util.sleep').run(1000));
  //
  if (this.cronapi.screen.getValueOfField("CargoCombo.active.salarioBase") == 100000) {
    //
    this.cronapi.screen.changeValueOfField("Colaborador.active.email", 10000);
  } else {
    //
    this.cronapi.screen.changeValueOfField("Colaborador.active.email", 31231);
  }
  //
  console.log('abccc');
  //
  console.log("Colaborador.active.email");
  //
  console.log("CargoCombo.active.salarioBase");
  //
  console.log(this.cronapi.screen.getValueOfField("CargoCombo.active.salarioBase"));
}
