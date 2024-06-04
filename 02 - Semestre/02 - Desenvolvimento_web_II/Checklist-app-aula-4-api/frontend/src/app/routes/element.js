const express = require('express');
const router = express.Router();
const genericController = require('../controllers/genericController');

// Nome da tabela e campos específicos para 'PeriodicElement'
const tableName = 'PeriodicElement';
const fields = ['position', 'name', 'weight', 'symbol'];

router.get('/', (req, res) => genericController.getAll(req, res, tableName));
router.get('/:id', (req, res) => genericController.getById(req, res, tableName));
router.post('/', (req, res) => genericController.create(req, res, tableName, fields));
router.put('/:id', (req, res) => genericController.update(req, res, tableName, fields));
router.delete('/:id', (req, res) => genericController.delete(req, res, tableName));

module.exports = router;