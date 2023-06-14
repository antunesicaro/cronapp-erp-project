window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Contrato = window.blockly.js.blockly.Contrato || {};

/**
 * @function confirmarForm
 *
 *
 *
 *
 * @author Ícaro Antunes
 * @since 12/06/2023, 11:33:48
 *
 */
window.blockly.js.blockly.Contrato.confirmarFormArgs = [];
window.blockly.js.blockly.Contrato.confirmarForm = async function() {
 var item;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Contrato:Executar', async function(sender_item) {
      item = sender_item;
    //
    (await this.cronapi.client('cronapi.screen.post').run("Contrato"));
    //
    (await this.cronapi.server('blockly.Contrato.atualizar').names('012b85a7', '1b4f3386').toPromise().run(item, this.cronapi.screen.getValueOfField("Contrato.active.id")));
    //
    this.cronapi.screen.refreshDatasource("Contrato", 'true');
  }.bind(this), this.cronapi.screen.getValueOfField("Contrato.active.colaborador"), this.cronapi.screen.getValueOfField("Contrato.active.tipoContrato"), this.cronapi.screen.getValueOfField("Contrato.active.id"));
}
