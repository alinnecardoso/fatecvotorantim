const express = require('express');
const router = express.Router();

const userController = require('../controller/userController')

router.get("/forms", userController.getForms);
router.post("/forms", userController.postForms);
router.get("/qtdEmail", userController.countUsers)
router.get("/users", userController.listUsers)
router.post("/forms/:email", userController.deleteUserByEmail)

module.exports = router;
