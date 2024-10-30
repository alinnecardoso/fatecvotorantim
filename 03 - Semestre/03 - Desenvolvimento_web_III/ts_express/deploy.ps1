# deploy.ps1

# Step 1: Build the Project
Write-Host "Building the project..."
npm run build

# Step 2: Copy package.json to the dist folder
Write-Host "Copying package.json to the dist folder..."
Copy-Item -Path "package.json" -Destination "dist\"

# Step 3: Deploy to Vercel with environment variable
Write-Host "Deploying to Vercel with STAGING=true..."
$env:STAGING = "true"  # Set the STAGING environment variable
vercel --env STAGING=$env:STAGING #powershell
vercel --env STAGING=true

Write-Host "Deployment Complete."
