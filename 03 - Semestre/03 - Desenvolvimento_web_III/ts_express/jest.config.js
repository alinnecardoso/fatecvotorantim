/** @type {import('ts-jest').JestConfigWithTsJest} **/
module.exports = {
  testEnvironment: "node",
  transform: {
    "^.+.tsx?$": ["ts-jest",{}],
  },
  coverageDirectory: "coverage", // Diretório dos relatórios de coverage
  coverageReporters: ["html", "text", "lcov", "json"], // Formatos de exportação dos relatórios
  collectCoverageFrom: [
    "src/**/*.{ts,js}",
    "!src/**/*.d.ts"
  ], // Regras para inclusão de scripts no calculo de coverage
  coverageThreshold: { // Mínimos de cobertura, seguindo diferentes critérios
    global: {
      branches: 80,
      functions: 82,
      lines: 87,
      statements: 81.5
    }
  }
};
